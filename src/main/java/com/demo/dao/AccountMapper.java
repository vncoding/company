package com.demo.dao;

import java.util.List;
import java.util.Map;

import com.demo.bean.Account;

public interface AccountMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account
     *
     * @mbggenerated Mon May 09 11:14:15 ICT 2016
     */
    int deleteByPrimaryKey(Integer accountId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account
     *
     * @mbggenerated Mon May 09 11:14:15 ICT 2016
     */
    int insert(Account record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account
     *
     * @mbggenerated Mon May 09 11:14:15 ICT 2016
     */
    int insertSelective(Account record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account
     *
     * @mbggenerated Mon May 09 11:14:15 ICT 2016
     */
    Account selectByPrimaryKey(Integer accountId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account
     *
     * @mbggenerated Mon May 09 11:14:15 ICT 2016
     */
    int updateByPrimaryKeySelective(Account record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account
     *
     * @mbggenerated Mon May 09 11:14:15 ICT 2016
     */
    int updateByPrimaryKey(Account record);

    /**
     * Select all pagging.
     *
     * @param map
     * @return List<Account>
     */
    List<Account> sellectAllPagging(Map<String,Object> map);

    /**
     * Get all count.
     *
     * @return count
     */
    int getAllCount();
}