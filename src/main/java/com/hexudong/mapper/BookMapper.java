package com.hexudong.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.hexudong.entity.Book;

public interface BookMapper {

	List<Book> getList(@Param("mhname")String mhname);

	List<Book> getSX();
	
	@Select("select hy,sjh from book where bid = #{bid}")
	Book getBookBybid(@Param("bid")int bid);

	void xg(@Param("bid")Integer bid, @Param("sjh")String sjh, @Param("hy")Integer hy);

}
