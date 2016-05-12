package com.demo.service;

import java.util.List;
import java.util.Map;

import com.demo.bean.Question;

public interface QuestionService {

	/**
	 * Select all pagging.
	 *
	 * @param rowbounds
	 * @return List<Question>
	 */
	public List<Question> sellectAllPagging(Map<String,Object> map);

	/**
	 * Get all count.
	 *
	 * @return count
	 */
	int getAllCount();

	/**
	 * Insert Question.
	 *
	 * @param record
	 * @return primary key
	 */
	int insert(Question record);

	/**
	 * Delete Question by id.
	 *
	 * @param id
	 * @return total record deleted.
	 */
    int delete(Integer id);

    /**
     * Select by primary key.
     *
     * @param QuestionId
     * @return Question
     */
    Question selectByPrimaryKey(Integer id);

    /**
     * Update Question.
     *
     * @param record
     * @return total record update.
     */
    int updateByPrimaryKey(Question record);
}
