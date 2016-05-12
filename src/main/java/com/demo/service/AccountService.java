package com.demo.service;

import java.util.List;
import java.util.Map;

import com.demo.bean.Account;

public interface AccountService {

	/**
	 * Select all pagging.
	 *
	 * @param rowbounds
	 * @return List<Account>
	 */
	public List<Account> sellectAllPagging(Map<String,Object> map);

	/**
	 * Get all count.
	 *
	 * @return count
	 */
	int getAllCount();

	/**
	 * Insert account.
	 *
	 * @param record
	 * @return primary key
	 */
	int insert(Account record);

	/**
	 * Delete account by id.
	 *
	 * @param id
	 * @return total record deleted.
	 */
    int delete(Integer id);

    /**
     * Select by primary key.
     *
     * @param accountId
     * @return Account
     */
    Account selectByPrimaryKey(Integer accountId);

    /**
     * Update account.
     *
     * @param record
     * @return total record update.
     */
    int updateByPrimaryKey(Account record);
}
