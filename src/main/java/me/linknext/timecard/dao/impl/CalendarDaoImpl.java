package me.linknext.timecard.dao.impl;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import me.linknext.timecard.dao.CalendarDao;
import me.linknext.timecard.entity.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class CalendarDaoImpl implements CalendarDao {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);

	}

	public List<Calendar> getMonthCalendar(Date dateFrom, Date dateTo) {

		String sql = "SELECT DATE, WORKING_DIV, ETR_TS, ETR_ID, REN_TS, REN_ID, DEL_FG FROM TIMECARD.CALENDAR_MST WHERE DATE BETWEEN ? AND ?";
		List<Calendar> calendarList = this.jdbcTemplate.query(sql, new CalendarMapper(),
				new Object[] { dateFrom, dateTo });

		return calendarList;

	}
	
	public void updateWorkingDiv(Calendar calendar) {
		String sql = "UPDATE TIMECARD.CALENDAR_MST SET WORKING_DIV = ? WHERE DATE = ?";
		this.jdbcTemplate.update(sql, calendar.getWorkingDiv(), calendar.getDate());
	}
	

	private static final class CalendarMapper implements RowMapper<Calendar> {
		public Calendar mapRow(ResultSet rs, int rowNum) throws SQLException {
			Calendar calendar = new Calendar();
			calendar.setDate(rs.getDate("DATE"));
			calendar.setWorkingDiv(rs.getString("WORKING_DIV"));
			return calendar;
		}
	}

}
