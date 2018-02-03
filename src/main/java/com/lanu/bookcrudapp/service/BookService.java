package com.lanu.bookcrudapp.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.lanu.bookcrudapp.model.Book;

public interface BookService {
	public Page<Book> findAll(Pageable arg0);

	public void save(Book book);

	public List<Book> findAll();

	public Book findOne(Long id);

	public List<Book> findByTitle(String title);

	public void deleteBook(Long id);
}
