package com.ssm.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.dubbo.service.LoginService;



@Controller
@RequestMapping("/loginController")
public class LoginAction {
	
	@Autowired
	private LoginService loginService;
	
	@RequestMapping("/login")
	public String login(HttpServletRequest request , Model model) {
		String value = "logout";
		String userName = (String)request.getParameter("userName");
		//调用登录服务接口
		if ("true".equals(loginService.login(userName))){
			return "login";
		}
		return value;
	}
}
