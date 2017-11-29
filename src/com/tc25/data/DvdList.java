package com.tc25.data;

import java.util.ArrayList;

import com.tc25.bean.DVD;
/**
 * @Title: DvdList.java
 * @package: com.tc25.data
 * @Description: dvd集合类,用来存放所有dvd
 * @author Administrator
 * @date 2017年11月20日下午8:08:34
 * @version 1.0
 */
public class DvdList {

	ArrayList<DVD> dvdList = new ArrayList<>();  //DVD集合，存放所有dvd
	
	ArrayList<Integer> idList = new ArrayList<>(); //id集合，存放递增的id
	

	public int createId() {
		
		idList.add(idList.size()+1);
		int i = idList.size();
		return i;
	}
	
	public void init() {
	
	DVD d1 = new DVD("奥特曼大战桃花怪",createId(),null,1,0);
	DVD d2 = new DVD("机器人大战假面超人",createId(),null,1,0);
	DVD d3 = new DVD("金刚大战吕布",createId(),null,1,0);
	DVD d4 = new DVD("狂蟒之灾",createId(),null,1,0);
	DVD d5 = new DVD("Java虐我千百遍,我待Java如初恋",createId(),null,1,0);
	DVD d6 = new DVD("程序员的传奇一生",createId(),null,1,0);
	DVD d7 = new DVD("java从入门到精通",createId(),null,1,0);
	DVD d8 = new DVD("风靡全球的Java",createId(),null,1,0);
	DVD d9 = new DVD("Java-面向对象的编程语言",createId(),null,1,0);
	DVD d10 = new DVD("沉香大战二郎神",createId(),null,1,0);
	
	dvdList.add(d1);
	dvdList.add(d2);
	dvdList.add(d3);
	dvdList.add(d4);
	dvdList.add(d5);
	dvdList.add(d6);
	dvdList.add(d7);
	dvdList.add(d8);
	dvdList.add(d9);
	dvdList.add(d10);

	}







}
