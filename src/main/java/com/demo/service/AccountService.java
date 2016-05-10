package com.demo.service;

import java.util.List;
import java.util.Map;

import com.demo.bean.Account;

public interface AccountService {

	/**
	 * Get User by Id.
	 *
	 * @param userId
	 * @return Account
	 */
	public Account getUserById(int userId);

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
}
