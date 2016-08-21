package me.linknext.timecard;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import me.linknext.timecard.javabean.ParamBean;

@Controller
@RequestMapping("/sample/mvc")
public class SpringMvcSampleController {

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

}
