package com.lanu.bookcrudapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lanu.bookcrudapp.model.Book;
import com.lanu.bookcrudapp.service.BookService;

@SpringBootApplication
public class BookCrudAppApplication implements CommandLineRunner {

	@Autowired
	private BookService bookService;

	public static void main(String[] args) {
		SpringApplication.run(BookCrudAppApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {

		if (bookService.findAll().isEmpty()) {
			Book book = new Book("The Future Is History", "How Totalitarianism Reclaimed Russia", "Masha Gessen",
					"isbn", 2017);
			book.setReadAlready(true);
			bookService.save(book);
			bookService.save(new Book("Behave", "The Biology of Humans at Our Best and Worst", "Robert M. Sapolsky",
					"isbn", 2017));
			bookService.save(new Book("I Can’t Breathe", "A Killing on Bay Street", "Matt Taibbi", "isbn", 2017));
			bookService.save(new Book("I Was Told to Come Alone", "My Journey Behind the Lines of Jihad",
					"Souad Mekhennet", "isbn", 2017));
			bookService.save(new Book("Rising Star", "The Making of Barack Obama", "David J. Garrow", "isbn", 2017));
			bookService.save(new Book("Lincoln in the Bardo", "President Abraham Lincoln’s 11-year-old son",
					"George Saunders", "isbn", 2017));
			bookService.save(new Book("Less", "comic novels", "Andrew Sean Greer", "isbn", 2017));
			bookService.save(new Book("The Power", "Novel", "Naomi Alderman", "isbn", 2017));
			bookService.save(new Book("Fire and Fury: Inside the Trump White House ", "#1 New York Times Bestseller",
					"Michael Wolff", "isbn", 2017));
			bookService.save(
					new Book("12 Rules for Life: An Antidote to Chaos", "Novel", "Jordan B. Peterson", "isbn", 2017));
			bookService.save(new Book("The Woman in the Window", "Novel", "A.J.Finn", "isbn", 2017));
		}
	}

}
