package me.linknext.timecard.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import me.linknext.timecard.entity.ParamBean;
import me.linknext.timecard.entity.Person;
import me.linknext.timecard.service.LoginService;

@Controller
@RequestMapping("/sample/mvc")
public class SpringMvcSampleController {

	@Autowired
	public LoginService loginService;
	
	@RequestMapping("/home")
	public String byPaht() {
		return "/sample/mvc/home";
	}

	@RequestMapping(value = "/bypath_and_method", method = RequestMethod.GET)
	public String byPathAndMethod() {
		
		return "/sample/mvc/bypath_and_method";
	}

	@RequestMapping(value = "/byparameter", method = RequestMethod.GET, params = "name")
	public String byParameter(@RequestParam String name, Model model) {

		model.addAttribute("name", name);

		return "/sample/mvc/byparameter";
	}

	@RequestMapping(value = "paramgroup", method = RequestMethod.GET)
	public String withParamGroup(ParamBean bean, Model model) {
		model.addAttribute("parambean", bean);

		return "/sample/mvc/paramgroup";
	}

	@RequestMapping(value = "path/{var}", method = RequestMethod.GET)
	public String withPathVariable(@PathVariable String var, Model model) {

		model.addAttribute("var", var);

		return "/sample/mvc/pathvariable";
	}

	@RequestMapping("/convert/primitive")
	public String primitive(@RequestParam Integer value, Model model) {

		model.addAttribute("primitive", value);

		return "/sample/mvc/convert_primitive";
	}

	// requires Joda-Time on the classpath
	@RequestMapping("/convert/date/{value}")
	public String date(@PathVariable @DateTimeFormat(iso = ISO.DATE) Date value, Model model) {
		model.addAttribute("date", value);

		return "/sample/mvc/convert_date";
	}

	@RequestMapping("bean")
	public String bean(ParamBean bean) {
		return "Converted " + bean;
	}

	@RequestMapping(value = "/post", method = RequestMethod.GET)
	public String form(Model model) {
		Person person = new Person();
		model.addAttribute("person", person);
		
		
		loginService.getUser("xxx");

		return "/sample/mvc/form";
	}

	@RequestMapping(value = "/post", method = RequestMethod.POST)
	public String form(Person person, Model model) {

		return "/sample/mvc/form";
	}

	@RequestMapping(value = "/form/update", method = RequestMethod.POST)
	public String formUpdate(Person person, Model model) {

		return "/sample/mvc/form";
	}

}
