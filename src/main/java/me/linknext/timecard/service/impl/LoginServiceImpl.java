package me.linknext.timecard.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.linknext.timecard.dao.UserDao;
import me.linknext.timecard.entity.User;
import me.linknext.timecard.service.LoginService;


@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	public UserDao userDao;

	@Override
	public User getUser(String UserId) {
		
		int count = userDao.count();
		
		
		

		return null;
	}
	
	

}
