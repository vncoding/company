package com.demo.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.demo.bean.Question;
import com.demo.dao.QuestionMapper;
import com.demo.service.QuestionService;

@Service("questionService")
public class QuestionServiceImpl implements QuestionService {
	@Resource
	private QuestionMapper questionDao;

	public List<Question> sellectAllPagging(Map<String, Object> map) {
		return this.questionDao.sellectAllPagging(map);
	}

	public int getAllCount() {
		return this.questionDao.getAllCount();
	}

	public int insert(Question account) {
		return this.questionDao.insert(account);
	}

	public int delete(Integer id) {
		return this.questionDao.deleteByPrimaryKey(id);
	}

	public Question selectByPrimaryKey(Integer id) {
		return this.questionDao.selectByPrimaryKey(id);
	}

	public int updateByPrimaryKey(Question record) {
		return this.questionDao.updateByPrimaryKey(record);
	}

}