package me.linknext.timecard;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import me.linknext.timecard.javabean.Calendar;
import me.linknext.timecard.javabean.Person;
import me.linknext.timecard.service.CalendarService;

@Controller
@RequestMapping("/sample/calendar")
@SessionAttributes("calendarForm")
public class CalendarController {

	@ModelAttribute("calendarForm")
	public CalendarForm createFormBean() {
		CalendarForm calendarForm = new CalendarForm();
		return calendarForm;
	}

	@Autowired
	public CalendarService calendarService;

	@RequestMapping(value = "/init", method = RequestMethod.GET)
	public String init(CalendarForm calendarForm, Model model) {


		List<Calendar> calendarList = calendarService.getMonthCalendar("201608");

		calendarForm.setCalendarList(calendarList);

		return "/sample/calendar/calendar";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(CalendarForm calendarForm, Model model) {

		calendarService.updateWorkingDiv(calendarForm.getCalendarList());

		return "/sample/calendar/calendar";
	}

}
