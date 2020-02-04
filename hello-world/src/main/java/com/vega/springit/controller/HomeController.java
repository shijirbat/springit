package com.vega.springit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/foo")
	public String foo(Model model) {
		model.addAttribute("pageTitle", "This page is FOO");
		return "foo";
	}

	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("pageTitle", "Home page");
		return "home";
	}

}