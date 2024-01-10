package com.school.controller;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.school.bean.Standard;
import com.school.service.StandardService;

@Controller
public class SchoolController {
	
	@Autowired
	private StandardService standardService;

	@RequestMapping(path="/standard",method = RequestMethod.GET)
	public ModelAndView stantard() {
		Map<String , Object> map=new HashMap<String, Object>();
		map.put("headerName", "Standard");
		map.put("stand", new Standard());
		return new ModelAndView("standard").addAllObjects(map);
		
	}
	
	@RequestMapping(path="/standard",method = RequestMethod.POST)
	public ModelAndView createStandard(
			@Valid @ModelAttribute(name="stand") Standard standard,
			BindingResult bindingResult,ModelMap map) {
		
//		standardService.save(standard);
		
		if(bindingResult.hasErrors()) {
			return new ModelAndView("standard","stand",standard);
		}
		else {
			standardService.save(standard);
			return new ModelAndView("data");
		}
		
	}
}
