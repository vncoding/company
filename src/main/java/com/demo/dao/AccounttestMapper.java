package com.demo.dao;

import com.demo.bean.AccounttestKey;

public interface AccounttestMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accounttest
     *
     * @mbggenerated Mon May 09 11:14:15 ICT 2016
     */
    int deleteByPrimaryKey(AccounttestKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accounttest
     *
     * @mbggenerated Mon May 09 11:14:15 ICT 2016
     */
    int insert(AccounttestKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accounttest
     *
     * @mbggenerated Mon May 09 11:14:15 ICT 2016
     */
    int insertSelective(AccounttestKey record);
}