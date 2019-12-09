package com.hexudong.service;

import java.util.List;

import com.hexudong.entity.Book;

public interface BookService {

	List<Book> getList(String mhname);

	List<Book> getSX();

	Book getBookBybid(int bid);

	void xg(int bid, String sjh, Integer hy);


	
}
