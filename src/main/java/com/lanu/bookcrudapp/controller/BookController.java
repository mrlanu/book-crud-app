package com.lanu.bookcrudapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lanu.bookcrudapp.service.BookService;

@Controller
public class BookController {

	@Autowired
	private BookService bookService;

	@RequestMapping("/")
	public String home() {
		return "redirect:/index";
	}

	@GetMapping("/")
	public String showPage(Model model, @RequestParam(defaultValue = "0") int page) {
		model.addAttribute("data", bookService.findAll(new PageRequest(page, 5)));
		model.addAttribute("currentPage", page);
		return "index";
	}
}
