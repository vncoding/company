package com.demo.dao;

import com.demo.bean.Test;

public interface TestMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbggenerated Thu May 12 15:13:51 ICT 2016
     */
    int deleteByPrimaryKey(Integer testId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbggenerated Thu May 12 15:13:51 ICT 2016
     */
    int insert(Test record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbggenerated Thu May 12 15:13:51 ICT 2016
     */
    int insertSelective(Test record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbggenerated Thu May 12 15:13:51 ICT 2016
     */
    Test selectByPrimaryKey(Integer testId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbggenerated Thu May 12 15:13:51 ICT 2016
     */
    int updateByPrimaryKeySelective(Test record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbggenerated Thu May 12 15:13:51 ICT 2016
     */
    int updateByPrimaryKey(Test record);
}