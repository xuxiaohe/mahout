package demo.controller;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import demo.pojo.User;
import demo.service.UserService;

@RestController
@RequestMapping("/user")
@Configuration
/**
 * 用户信息Controller,用于接受客户端传递
 * 的数据，进行用户相关操作
 * @author nes
 *
 */
public class userController {

	@Inject
	Environment env;

	@Autowired
	public UserService userService;

	public userController() {
		super();
	}

	/**
	 * 搜索用户 条件：用户名，手机，邮箱
	 * 
	 * @param request
	 * @return
	 */

	@RequestMapping("/searchbyinfo")
	public @ResponseBody Object searchbyinfo(HttpServletRequest request) {

		List<User> users = userService.findAll();

		return users;
	}
}