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
			bookService.save(new Book("The Future Is History", "How Totalitarianism Reclaimed Russia", "Masha Gessen",
					"978-0525534068", 2017));
			bookService.save(new Book("Behave", "The Biology of Humans at Our Best and Worst", "Robert M. Sapolsky",
					"978-1448129782", 2017));
			bookService.save(
					new Book("I Can’t Breathe", "A Killing on Bay Street", "Matt Taibbi", "978-0753548691", 2017));
			bookService.save(new Book("I Was Told to Come Alone", "My Journey Behind the Lines of Jihad",
					"Souad Mekhennet", "978-0349008387", 2017));
			bookService.save(
					new Book("Rising Star", "The Making of Barack Obama", "David J. Garrow", "978-0008229375", 2017));
			bookService.save(new Book("Lincoln in the Bardo", "President Abraham Lincoln’s 11-year-old son",
					"George Saunders", "978-9044539219", 2017));
			bookService.save(new Book("Less", "comic novels", "Andrew Sean Greer", "978-0316316149", 2017));
			bookService.save(new Book("The Power", "Novel", "Naomi Alderman", "978-0316547604", 2017));
			bookService.save(new Book("Fire and Fury: Inside the Trump White House", "#1 New York Times Bestseller",
					"Michael Wolff", "978-1250158062", 2017));
			bookService.save(new Book("12 Rules for Life: An Antidote to Chaos", "Novel", "Jordan B. Peterson",
					"978-0241351642", 2017));
			bookService.save(new Book("The Woman in the Window", "Novel", "A.J.Finn", "978-7865345455", 2017));
			bookService.save(new Book("The Hate U Give", "Novel", "Angie Thomas", "978-0062498533", 2017));
			bookService.save(new Book("Snow Girl", "Novel", "JR Poe", "978-1934824764", 2018));
			bookService.save(new Book("Dear Martin", "BESTSELLER", "Nic Stone", "978-1101939499", 2017));
			bookService.save(new Book("All American Boys", "BESTSELLER", "Jason Reynolds", "978-1481463348", 2017));
			bookService.save(new Book("Ghost (Track)", "Novel", "Jason Reynolds", "978-1481450164", 2017));
			bookService.save(
					new Book("Bigfoot: Mysterious Monsters", "Novel", "David Michael Slater", "978-1944589233", 2017));
			bookService.save(new Book("Turtles All the Way Down", "Novel", "John Green", "978-0525555360", 2017));
			bookService.save(new Book("One of Us Is Lying", "Novel", "Karen M. McManus", "978-1524714680", 2017));
			bookService.save(new Book("They Both Die at the End", "Novel", "Adam Silvera", "978-0062457790", 2017));
			bookService.save(new Book("Desperate Desire", "Drama", "Tracy Reed", "978-0373107292", 2017));
			bookService.save(new Book("Barefoot Bride", "Novel", "Dorothy Cork", "978-0373023905", 2017));
			bookService.save(new Book("The Look of Love ", "Novel", "Bella Andre", "978-0142180532", 2017));
			bookService.save(new Book("Mercury Rising", "Novel", "Jerusha Jones", "978-0380802944", 2017));
		}
	}

}
