package me.linknext.timecard.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

import me.linknext.timecard.entity.User;
import me.linknext.timecard.form.LoginForm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * Handles requests for the application home page.
 */
@Controller
@SessionAttributes("loginForm")
public class LoginController {

	private static final Logger logger = LoggerFactory
			.getLogger(LoginController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,
				DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		LoginForm loginForm = new LoginForm();

		model.addAttribute("loginForm", loginForm);

		return "login";
	}

	@RequestMapping(value = "/sample", method = RequestMethod.GET)
	public String sample(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,
				DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "sample";
	}

	@RequestMapping(value = "/sample2", method = RequestMethod.GET)
	public String sample2(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,
				DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "sample2";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String initCreationForm(Map<String, Object> model) {
		User User = new User();
		model.put("user", User);
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String processCreationForm(@ModelAttribute("loginForm") LoginForm loginForm,
			BindingResult result) {

		return "home";
	}

}
