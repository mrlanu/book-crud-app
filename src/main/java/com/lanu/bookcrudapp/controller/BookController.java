package com.lanu.bookcrudapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.ExampleMatcher.StringMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lanu.bookcrudapp.model.Book;
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
		model.addAttribute("data", bookService.findAll(new PageRequest(page, 10)));
		model.addAttribute("currentPage", page);
		return "index";
	}

	@PostMapping("/save")
	public String save(Book book) {
		bookService.save(book);
		return "redirect:/";
	}

	@GetMapping("/delete")
	public String deleteBook(Long id) {
		bookService.deleteBook(id);
		return "redirect:/";
	}

	@GetMapping("/findOne")
	@ResponseBody
	public Book findOne(Long id) {
		return bookService.findOne(id);
	}

	@PostMapping("/search")
	public String showSearchPage(@RequestParam(defaultValue = "null") String theSearchName, Model model,
			@RequestParam(defaultValue = "0") int page) {
		Book theBook = new Book();
		theBook.setTitle(theSearchName);
		// Example<Book> example = Example.of(theBook);
		ExampleMatcher matcher = ExampleMatcher.matching().withStringMatcher(StringMatcher.CONTAINING).withIgnoreCase();
		Page<Book> p = bookService.findAll(Example.of(theBook, matcher), new PageRequest(0, 10));
		int numberOfElement = p.getNumberOfElements();
		model.addAttribute("data", p);

		if (numberOfElement > 0)
			return "index";
		return "redirect:/";
	}
}
