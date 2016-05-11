package com.demo.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.service.AccountService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	@Resource
	private AccountService userService;

	/**
	 * Login page
	 *
	 * @return login page id
	 */
	@RequestMapping(value = { "/login" })
	public String getLoginPage() {
		return "loginPage";
	}

	/**
	 * Home page.
	 *
	 * @return
	 */
	@RequestMapping(value = { "/" })
	public String getHomePage() {
		return "accountsPage";
	}

}
