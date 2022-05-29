package com.fatec.todos.adapters;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path = "/todos")
public class MainController {
	@GetMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index");
	}
	@GetMapping("/home")
	public ModelAndView home() {
		return new ModelAndView("admin/home");
	}
	@GetMapping("/acessibilidade")
	public ModelAndView acessibilidade() {
		return new ModelAndView("acessibilidade");
	}
	@GetMapping("/product")
	public ModelAndView product() {
		return new ModelAndView("product");
	}
}
