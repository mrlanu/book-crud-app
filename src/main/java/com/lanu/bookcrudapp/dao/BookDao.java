package com.lanu.bookcrudapp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lanu.bookcrudapp.model.Book;

public interface BookDao extends JpaRepository<Book, Long> {
	public List<Book> findByTitle(String title);

}
