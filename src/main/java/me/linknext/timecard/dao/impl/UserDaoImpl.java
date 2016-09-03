package me.linknext.timecard.dao.impl;

import javax.sql.DataSource;

import me.linknext.timecard.dao.UserDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);

	}

	public int count() throws DataAccessException {

		int count = this.jdbcTemplate.queryForObject("select count(*) from user_mst where user_id = ?", Integer.class,
				"000001");

		return count;
	}

}
