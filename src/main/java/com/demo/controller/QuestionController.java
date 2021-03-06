package com.demo.controller;

import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.bean.Question;
import com.demo.service.QuestionService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@Controller
@RequestMapping("/question")
public class QuestionController {

	private static final String MODEL_BEAN_ID = "crudObj";

	@Autowired
	private QuestionService questionService;

	/**
	 * Login page.
	 *
	 * @return questionsPage
	 */
	@RequestMapping(value = { "/" })
	public String getLoginPage() {
		return "questionsPage";
	}

	/**
	 * Return create question page.
	 *
	 * @return createQuestionPage
	 */
	@RequestMapping(value = { "/create" })
	public String createAccountPage() {
		return "createQuestionPage";
	}

	/**
	 * Get list question
	 *
	 * @param request
	 * @return application/json
	 * @throws IOException
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody String list(HttpServletRequest request) throws IOException {

		// Fetch the page number from client
		Integer pageNumber = 0;
		if (null != request.getParameter("iDisplayStart"))
			pageNumber = (Integer.valueOf(request.getParameter("iDisplayStart")) / 10) + 1;

		// Fetch Page display length
		Integer pageDisplayLength = Integer.valueOf(request.getParameter("iDisplayLength"));

		Integer totalDisplayRecords = questionService.getAllCount();

		Map<String, Object> map = new HashMap<String, Object>();

		map.put("startIndex", (pageNumber - 1) * pageDisplayLength);
		map.put("pageSize", pageDisplayLength);

		// Create page list data
		List<Question> questionList = questionService.sellectAllPagging(map);

		if (pageNumber == 1) {
			Collections.shuffle(questionList);
		} else if (pageNumber == 2) {
			Collections.shuffle(questionList);
		} else {
			Collections.shuffle(questionList);
		}

		QuestionJsonObject questionJsonObject = new QuestionJsonObject();
		// Set Total display record
		questionJsonObject.setiTotalDisplayRecords(totalDisplayRecords);
		// Set Total record
		questionJsonObject.setiTotalRecords(totalDisplayRecords);
		questionJsonObject.setAaData(questionList);

		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json2 = gson.toJson(questionJsonObject);

		return json2;
	}

	/**
	 * Create account.
	 *
	 * @param entity
	 * @param response
	 *
	 */
	@RequestMapping(value = "/createSave", method = RequestMethod.POST, consumes = "application/json")
	public @ResponseBody Map<String, ? extends Object> create(@RequestBody Question entity,
			HttpServletResponse response) {
		if (questionService.insert(entity) > 0) {
			response.setStatus(HttpServletResponse.SC_CREATED);
		} else {
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
		}
		return null;
	}

	/**
	 * DELETE Operation
	 *
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/{pk}", method = DELETE)
	@ResponseBody
	public boolean delete(@PathVariable("pk") Integer id, HttpServletResponse response) {
		questionService.delete(id);
		response.setStatus(HttpServletResponse.SC_OK);
		return true;
	}

	/**
	 * Call update page.
	 *
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "update/{id}", method = GET)
	public String update(@PathVariable("id") Integer id, Model model) {

		Question entity = questionService.selectByPrimaryKey(id);
		model.addAttribute(MODEL_BEAN_ID, entity);
		return "updateAccountPage";
	}

	/**
	 * UPDATE Account Operation
	 *
	 * @param accountForm
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/updateSave/{id}", method = RequestMethod.POST, consumes = "application/json")
	public @ResponseBody Map<String, ? extends Object> update(@PathVariable Integer id, @RequestBody Question entity,
			HttpServletResponse response) {

		Question entityToUpdate = questionService.selectByPrimaryKey(id);
		if (entityToUpdate != null) {
			if (questionService.updateByPrimaryKey(entity) > 0) {
				response.setStatus(HttpServletResponse.SC_OK);
			} else {
				response.setStatus(HttpServletResponse.SC_NOT_FOUND);
			}
		}
		return null;
	}

	class QuestionJsonObject {

		int iTotalRecords;

		int iTotalDisplayRecords;

		String sEcho;

		String sColumns;

		List<Question> aaData;

		public int getiTotalRecords() {
			return iTotalRecords;
		}

		public void setiTotalRecords(int iTotalRecords) {
			this.iTotalRecords = iTotalRecords;
		}

		public int getiTotalDisplayRecords() {
			return iTotalDisplayRecords;
		}

		public void setiTotalDisplayRecords(int iTotalDisplayRecords) {
			this.iTotalDisplayRecords = iTotalDisplayRecords;
		}

		public String getsEcho() {
			return sEcho;
		}

		public void setsEcho(String sEcho) {
			this.sEcho = sEcho;
		}

		public String getsColumns() {
			return sColumns;
		}

		public void setsColumns(String sColumns) {
			this.sColumns = sColumns;
		}

		public List<Question> getAaData() {
			return aaData;
		}

		public void setAaData(List<Question> aaData) {
			this.aaData = aaData;
		}

	}

}
