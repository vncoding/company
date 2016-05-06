package com.demo.service.impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.demo.bean.User;
import com.demo.dao.UserMapper;
import com.demo.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
    @Resource
    private UserMapper userDao;

    public User getUserById(int userId) {
        return this.userDao.selectByPrimaryKey(userId);
    }
}