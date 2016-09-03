package me.linknext.timecard.service;

import java.util.List;

import me.linknext.timecard.entity.Calendar;

public interface CalendarService {
	
	public List<Calendar> getMonthCalendar(String yyyymm);
	
	public List<Calendar> updateWorkingDiv(List<Calendar> calendarList);

}
