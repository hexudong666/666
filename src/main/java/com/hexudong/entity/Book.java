package com.hexudong.entity;

import javax.validation.constraints.Pattern;

public class Book {
	private Integer bid;//图书编号
	private String bname;//图书名字
	@Pattern(regexp="\\d{11}",message="11位数字")
	private String sjh;//手机号
	private String zz;//作者
	private int hy;//受欢迎程度
	private int tid;//类型id
	private String lx;//类型别称
	
	private Type type;//类型对象

	public Integer getBid() {
		return bid;
	}

	public void setBid(Integer bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getSjh() {
		return sjh;
	}

	public void setSjh(String sjh) {
		this.sjh = sjh;
	}

	public String getZz() {
		return zz;
	}

	public void setZz(String zz) {
		this.zz = zz;
	}

	public int getHy() {
		return hy;
	}

	public void setHy(int hy) {
		this.hy = hy;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getLx() {
		return lx;
	}

	public void setLx(String lx) {
		this.lx = lx;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
	
	
}
