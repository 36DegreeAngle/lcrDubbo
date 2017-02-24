package com.ssm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssm.dao.UserMapper;
import com.ssm.dubbo.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Resource
	UserMapper userMapper;
	
	public String login(String userName) {
		// TODO Auto-generated method stub
		//查询数据库用户是否存在
		if (userMapper.selectByUserName(userName) != null){
			return "true";
		}
		return "false";
	}

	public String logour() {
		// TODO Auto-generated method stub
		return null;
	}

}
