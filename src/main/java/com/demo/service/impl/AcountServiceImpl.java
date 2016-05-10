package com.demo.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.demo.bean.Account;
import com.demo.dao.AccountMapper;
import com.demo.service.AccountService;

@Service("accountService")
public class AcountServiceImpl implements AccountService {
    @Resource
    private AccountMapper accountDao;

    public Account getUserById(int userId) {
        return this.accountDao.selectByPrimaryKey(userId);
    }

	public List<Account> sellectAllPagging(Map<String,Object> map) {
		return this.accountDao.sellectAllPagging(map);
	}

	public int getAllCount() {
		return this.accountDao.getAllCount();
	}

}