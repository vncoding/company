package com.demo.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.demo.bean.User;
import com.demo.service.IUserService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	 @Resource
	 private IUserService userService;


	@RequestMapping(value = {"/page1","/"}, method = RequestMethod.GET)
	public String firstPage(Model model) {
		model.addAttribute("firstPageMessage", "This is the first page");
		return "firstpage";
	}

	@RequestMapping(value = "/page2", method = RequestMethod.GET)
	public String secondPage(Model model) {
		model.addAttribute("secondPageMessage", "This is the second page");
		return "secondpage";
	}

	@RequestMapping("/showUserTest")
	public String toIndex(HttpServletRequest request, Model model) {
	    int userId = Integer.parseInt(request.getParameter("id"));
	    User user = this.userService.getUserById(userId);
	    model.addAttribute("user", user);
	    return "showUser";
	}

}
