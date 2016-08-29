package me.linknext.timecard.service;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import me.linknext.timecard.dao.CalendarDao;
import me.linknext.timecard.javabean.Calendar;

@Service
public class CalendarServiceImpl implements CalendarService {

	@Autowired
	public CalendarDao calendarDao;

	public List<Calendar> getMonthCalendar(String yyyymm) {

		List<Calendar> calendarList = new ArrayList<Calendar>();

		// 月初日を取得する
		String dateStr = yyyymm + "01";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Date dateFrom = null;
		try {
			dateFrom = new Date(sdf.parse(dateStr).getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}

		// 月末を取得する
		java.util.Calendar cal = java.util.Calendar.getInstance();
		cal.setTime(dateFrom);
		int amount = cal.getActualMaximum(java.util.Calendar.DATE) - 1;
		cal.add(java.util.Calendar.DATE, amount);
		Date dateTo = new Date(cal.getTimeInMillis());

		calendarList = calendarDao.getMonthCalendar(dateFrom, dateTo);
		if (calendarList.isEmpty()) {
			return calendarList;
		}
		
		// 初日の曜日を判定する
		java.util.Calendar calFirstDay = java.util.Calendar.getInstance();
		calFirstDay.setTime(calendarList.get(0).getDate());
		calFirstDay.getFirstDayOfWeek();
		int dayOfWeek = calFirstDay.get(java.util.Calendar.DAY_OF_WEEK);
		for (int i = 1; i < dayOfWeek; i++) {
			Calendar calendar = new Calendar();
			calendarList.add(0, calendar);
		}

		return calendarList;
	}
	
	public List<Calendar> updateWorkingDiv(List<Calendar> calendarList) {

		for (Calendar calendar : calendarList) {
			if (calendar.getDate() == null) {
				continue;
			}
			
			if (StringUtils.isEmpty(calendar.getWorkingDiv())) {
				calendar.setWorkingDiv("0");
			}
			
			calendarDao.updateWorkingDiv(calendar);
		}

		return calendarList;
	}

}
