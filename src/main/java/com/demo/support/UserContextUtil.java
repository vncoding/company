package com.demo.support;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;

import com.demo.bean.User;
import com.demo.dao.UserMapper;
import com.demo.sercurity.UserContext;

/**
 * Utility class to get user informations in a request
 *
 * @author maachou
 *
 */
@Component("userContext")
public class UserContextUtil {

	@Autowired
	UserMapper userMapper;

	/**
	 * Getting the user Email address used in the authentification process
	 *
	 * @return
	 */
	public String getUsername() {
		return UserContext.getUsername();
	}

	/**
	 * Getting the current user first name & last Name
	 *
	 * @return
	 */
	public String getUserFullName() {
		String result = "";
		User user = userMapper.findByEmail(UserContext
				.getUsername());
		if (user != null) {
			result = user.getEmail();
		}
		return result;
	}

	/**
	 * Checking if the current user is identified
	 *
	 * @return
	 */
	public boolean isAnonymousUser() {
		return "anonymousUser".equalsIgnoreCase(getUsername());
	}

	/**
	 * Getting the current user local id (en, fr...)
	 *
	 * @return
	 */
	public Locale getLocale() {
		return LocaleContextHolder.getLocale();
	}

	/**
	 * Getting the current user roles
	 *
	 * @return
	 */
	public static List<String> getRoles() {
		return UserContext.getRoles();
	}
}
