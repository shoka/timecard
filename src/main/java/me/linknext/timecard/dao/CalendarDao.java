package me.linknext.timecard.dao;

import java.sql.Date;
import java.util.List;

import me.linknext.timecard.javabean.Calendar;

public interface CalendarDao {

	public List<Calendar> getMonthCalendar(Date dateFrom, Date dateTo);
	
	public void updateWorkingDiv(Calendar calendar);

}
