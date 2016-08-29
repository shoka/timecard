package me.linknext.timecard;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import me.linknext.timecard.javabean.SampleBean;

@Controller
@RequestMapping("/sample/jsptag")
public class JspTagSampleController {

	@RequestMapping(value = "/core", method = RequestMethod.GET)
	public String core(Locale locale, Model model) {
		
		List<SampleBean> list = new ArrayList<SampleBean>();	
		SampleBean katsu = new SampleBean();
		katsu.setName("葛");
		list.add(katsu);
		
		SampleBean komiya = new SampleBean();
		komiya.setName("小宮");
		list.add(komiya);
		
		SampleBean yoshimoto = new SampleBean();
		yoshimoto.setName("吉本");
		list.add(yoshimoto);
		
		model.addAttribute("userList", list);

		return "sample/jsptag/core";
	}
	
	@RequestMapping(value = "/fmt", method = RequestMethod.GET)
	public String fmt(Locale locale, Model model) {

		return "sample/jsptag/fmt";
	}

}
