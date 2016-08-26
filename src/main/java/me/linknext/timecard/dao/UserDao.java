package me.linknext.timecard.dao;

import org.springframework.dao.DataAccessException;

public interface UserDao {
	
	public int count()  throws DataAccessException;

}
