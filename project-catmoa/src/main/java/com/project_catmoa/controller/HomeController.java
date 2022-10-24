package com.project_catmoa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping(path = {"/", "home"})
	public String home() {
		
		return "home";	// --> /WEB-INF/views/ + home + .jsp
	}
	
	@GetMapping(path = {"header"})
	public String header() {
		
		return "header";	// --> /WEB-INF/views/ + home + .jsp
	}
	
	@GetMapping(path = {"services"})
	public String services() {
		
		return "services";	// --> /WEB-INF/views/ + home + .jsp
	}
	
	@GetMapping(path = {"blog"})
	public String blog() {
		
		return "blog";
	}
}
