package com.hexudong.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hexudong.entity.Book;
import com.hexudong.service.BookService;

@Controller
public class BookController {

	@Autowired
	private BookService service;
	/**
	 * 
	    * @Title: getList
	    * @Description: 列表
	    * @param @param model
	    * @param @param pageNum
	    * @param @param mhname
	    * @param @return    参数
	    * @return String    返回类型
	    * @throws
	 */
	@RequestMapping("list")
	private String getList(Model model,@RequestParam(defaultValue="1")int pageNum,String mhname) {
		PageHelper.startPage(pageNum, 3);
		List<Book>list = service.getList(mhname);
		PageInfo<Book> info = new PageInfo<>(list);
		model.addAttribute("list", list);
		model.addAttribute("info", info);
		model.addAttribute("mhname", mhname);
		return "list";
	}
	
	/**
	 * 
	    * @Title: getSX
	    * @Description: 升序
	    * @param @param model
	    * @param @return    参数
	    * @return String    返回类型
	    * @throws
	 */
	@RequestMapping("sx")
	private String getSX(Model model) {
		List<Book> list = service.getSX();
		model.addAttribute("list", list);
		return "list";
	}
	//添加文件
	/*private Stirng dr() {
		String dq  =TestFileUtils.read("C:\\Users\\Administrator\\Desktop\\data.txt");
		Book book = new Book();
		
		return "";
	}*/
	
	/**
	 * 
	    * @Title: getBookBybid
	    * @Description: 查询
	    * @param @param bid
	    * @param @param model
	    * @param @return    参数
	    * @return String    返回类型
	    * @throws
	 */
	//修改前查询
	@RequestMapping("toupd")
	private String getBookBybid(int bid,Model model) {
		Book book = service.getBookBybid(bid);
		model.addAttribute("book", book);
		return "upd";
	}
	/***
	 * 
	    * @Title: xg
	    * @Description: 修改
	    * @param @param sjh
	    * @param @param hy
	    * @param @param bid
	    * @param @return    参数
	    * @return String    返回类型
	    * @throws
	 */
	//修改
	@RequestMapping("xg")
	private String xg(String sjh,Integer  hy ,int bid) {
		service.xg(bid,sjh,hy);
		return "redirect:/list";
	}
	
	
	
	
}
