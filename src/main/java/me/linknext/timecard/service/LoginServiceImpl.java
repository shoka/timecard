package me.linknext.timecard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.linknext.timecard.dao.UserDao;
import me.linknext.timecard.javabean.User;


@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	public UserDao userDao;

	@Override
	public User getUser(String UserId) {
		
	//	int count = userDao.count();

		return null;
	}
	
	

}
