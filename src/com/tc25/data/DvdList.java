package com.tc25.data;

import java.util.ArrayList;

import com.tc25.bean.DVD;
/**
 * @Title: DvdList.java
 * @package: com.tc25.data
 * @Description: dvd������,�����������dvd
 * @author Administrator
 * @date 2017��11��20������8:08:34
 * @version 1.0
 */
public class DvdList {

	ArrayList<DVD> dvdList = new ArrayList<>();  //DVD���ϣ��������dvd
	
	ArrayList<Integer> idList = new ArrayList<>(); //id���ϣ���ŵ�����id
	

	public int createId() {
		
		idList.add(idList.size()+1);
		int i = idList.size();
		return i;
	}
	
	public void init() {
	
	DVD d1 = new DVD("��������ս�һ���",createId(),null,1,0);
	DVD d2 = new DVD("�����˴�ս���泬��",createId(),null,1,0);
	DVD d3 = new DVD("��մ�ս����",createId(),null,1,0);
	DVD d4 = new DVD("����֮��",createId(),null,1,0);
	DVD d5 = new DVD("JavaŰ��ǧ�ٱ�,�Ҵ�Java�����",createId(),null,1,0);
	DVD d6 = new DVD("����Ա�Ĵ���һ��",createId(),null,1,0);
	DVD d7 = new DVD("java�����ŵ���ͨ",createId(),null,1,0);
	DVD d8 = new DVD("����ȫ���Java",createId(),null,1,0);
	DVD d9 = new DVD("Java-�������ı������",createId(),null,1,0);
	DVD d10 = new DVD("�����ս������",createId(),null,1,0);
	
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
