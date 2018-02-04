package com.lanu.bookcrudapp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.lanu.bookcrudapp.dao.BookDao;
import com.lanu.bookcrudapp.model.Book;

@Service
@Transactional
public class BookServiceImpl implements BookService {

	@Autowired
	private BookDao bookDao;

	@Override
	public Page<Book> findAll(Pageable arg0) {
		return bookDao.findAll(arg0);
	}

	@Override
	public void save(Book book) {
		bookDao.save(book);
	}

	@Override
	public List<Book> findAll() {
		return bookDao.findAll();
	}

	@Override
	public Book findOne(Long id) {
		return bookDao.findOne(id);
	}

	@Override
	public void deleteBook(Long id) {
		bookDao.delete(id);
	}

	@Override
	public <S extends Book> Page<S> findAll(Example<S> example, Pageable pageable) {
		return bookDao.findAll(example, pageable);
	}

	@Override
	public <S extends Book> List<S> findAll(Example<S> arg0) {
		// TODO Auto-generated method stub
		return bookDao.findAll(arg0);
	}

}
