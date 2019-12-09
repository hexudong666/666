package com.hexudong.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexudong.entity.Book;
import com.hexudong.mapper.BookMapper;
import com.hexudong.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookMapper mapper;
	
	@Override
	public List<Book> getList(String mhname) {
		return mapper.getList(mhname);
	}
	
	
	@Override
	public List<Book> getSX() {
		return mapper.getSX();
	}
	
	@Override
	public Book getBookBybid(int bid) {
		return mapper.getBookBybid(bid);
	}
	
	
	@Override
	public void xg(int bid, String sjh, Integer hy) {
		mapper.xg(bid,sjh,hy);
	}
	
	
}
