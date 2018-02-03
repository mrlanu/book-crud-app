package com.lanu.bookcrudapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String title;
	private String description;
	private String author;
	private String isbn;
	private int printYear;
	private Boolean readAlready;

	public Book() {

	}

	public Book(String title, String description, String author, String isbn, int printYear) {

		this.title = title;
		this.description = description;
		this.author = author;
		this.isbn = isbn;
		this.printYear = printYear;
		this.readAlready = false;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getPrintYear() {
		return printYear;
	}

	public void setPrintYear(int printYear) {
		this.printYear = printYear;
	}

	public Boolean isReadAlready() {
		return readAlready;
	}

	public void setReadAlready(Boolean readAlready) {
		this.readAlready = readAlready;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", description=" + description + ", author=" + author + ", isbn="
				+ isbn + ", printYear=" + printYear + ", readAlready=" + readAlready + "]";
	}

}
