package edu.shop.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	public HomeController() {
		
	}

	@RequestMapping(value="/home", method=RequestMethod.GET)
	public ModelAndView index() {
		ModelAndView modelandView = new ModelAndView();
		modelandView.setViewName("home.jsp");
		
		
		return modelandView;
	}
}