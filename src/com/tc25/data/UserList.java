package com.tc25.data;

import java.util.ArrayList;

import com.tc25.bean.User;
/**
 * @Title: UserList.java
 * @package: com.tc25.data
 * @Description: UserList类，对象为当前userlist
 * @author Administrator
 * @date 2017年11月21日下午8:02:28
 * @version 1.0
 */
public class UserList {

	private ArrayList<User> userList ;
	private ArrayList<Integer> userIdList ;
	private ArrayList<String> accountList;
	private static UserList instance;
	
	private UserList() {
		init();
	}
	
	public static UserList getInstance() {
		if(instance == null) {
			instance = new UserList();
		}
		return instance;
	}
	
	
	public int userIdCreate() {
		int i = 0;
		userIdList.add(userIdList.size()+1);
		i = userIdList.size();
		return i;
	}
	
	
	public void init() {
		
		userList = new ArrayList<>();
		userIdList = new ArrayList<>();
		accountList = new ArrayList<>();
		
		userList.add(new User("zhangxueyou","张学友", userIdCreate(), "zxy123qwe", "我的名字是张学友",true));
		userList.add(new User("liudehua","刘德华", userIdCreate(), "ldh123qwe", "我的名字是刘德华",true));
		userList.add(new User("guofucheng","郭富城", userIdCreate(), "gfc123qwe", "我的名字是郭富城",true));
		userList.add(new User("liangchaowei","梁朝伟", userIdCreate(), "lcw123qwe", "我的名字是梁朝伟",true));
		userList.add(new User("wuyanzu","吴彦祖", userIdCreate(), "wyz123qwe", "我的名字是吴彦祖",true));
		userList.add(new User("zhangjiahui","张家辉", userIdCreate(), "zjh123qwe", "我的名字是张家辉",true));
		userList.add(new User("liangjiahui","梁家辉", userIdCreate(), "zljh123qwe", "我的名字是梁家辉",true));
		userList.add(new User("chenhaonan","陈浩南", userIdCreate(), "chn123qwe", "我的名字是陈浩南",true));
		userList.add(new User("pengyuyan","彭于晏", userIdCreate(), "pyy123qwe", "我的名字是彭于晏",true));
		userList.add(new User("wanglihong","王力宏", userIdCreate(), "wlh123qwe", "我的名字是王力宏",true));
		
		
		for (User a : userList) {
			accountList.add(a.getUserAccount());
		}
	
	}

	public ArrayList<User> getUserList() {
		return userList;
	}

	public void setUserList(ArrayList<User> userList) {
		this.userList = userList;
	}

	public ArrayList<Integer> getUserIdList() {
		return userIdList;
	}

	public void setUserIdList(ArrayList<Integer> userIdList) {
		this.userIdList = userIdList;
	}
	
	public ArrayList<String> getAccountList() {
		return accountList;
	}

	public void setAccountList(ArrayList<String> accountList) {
		this.accountList = accountList;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
