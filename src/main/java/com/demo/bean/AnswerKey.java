package com.demo.bean;

public class AnswerKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column answer.AnswerId
     *
     * @mbggenerated Thu May 05 15:29:37 ICT 2016
     */
    private Integer answerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column answer.QuestionId
     *
     * @mbggenerated Thu May 05 15:29:37 ICT 2016
     */
    private Integer questionId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column answer.AnswerId
     *
     * @return the value of answer.AnswerId
     *
     * @mbggenerated Thu May 05 15:29:37 ICT 2016
     */
    public Integer getAnswerId() {
        return answerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column answer.AnswerId
     *
     * @param answerId the value for answer.AnswerId
     *
     * @mbggenerated Thu May 05 15:29:37 ICT 2016
     */
    public void setAnswerId(Integer answerId) {
        this.answerId = answerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column answer.QuestionId
     *
     * @return the value of answer.QuestionId
     *
     * @mbggenerated Thu May 05 15:29:37 ICT 2016
     */
    public Integer getQuestionId() {
        return questionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column answer.QuestionId
     *
     * @param questionId the value for answer.QuestionId
     *
     * @mbggenerated Thu May 05 15:29:37 ICT 2016
     */
    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }
}