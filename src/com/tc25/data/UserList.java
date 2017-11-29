package com.tc25.data;

import java.util.ArrayList;

import com.tc25.bean.User;
/**
 * @Title: UserList.java
 * @package: com.tc25.data
 * @Description: UserList�࣬����Ϊ��ǰuserlist
 * @author Administrator
 * @date 2017��11��21������8:02:28
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
		
		userList.add(new User("zhangxueyou","��ѧ��", userIdCreate(), "zxy123qwe", "�ҵ���������ѧ��",true));
		userList.add(new User("liudehua","���»�", userIdCreate(), "ldh123qwe", "�ҵ����������»�",true));
		userList.add(new User("guofucheng","������", userIdCreate(), "gfc123qwe", "�ҵ������ǹ�����",true));
		userList.add(new User("liangchaowei","����ΰ", userIdCreate(), "lcw123qwe", "�ҵ�����������ΰ",true));
		userList.add(new User("wuyanzu","������", userIdCreate(), "wyz123qwe", "�ҵ�������������",true));
		userList.add(new User("zhangjiahui","�żһ�", userIdCreate(), "zjh123qwe", "�ҵ��������żһ�",true));
		userList.add(new User("liangjiahui","���һ�", userIdCreate(), "zljh123qwe", "�ҵ����������һ�",true));
		userList.add(new User("chenhaonan","�º���", userIdCreate(), "chn123qwe", "�ҵ������ǳº���",true));
		userList.add(new User("pengyuyan","������", userIdCreate(), "pyy123qwe", "�ҵ�������������",true));
		userList.add(new User("wanglihong","������", userIdCreate(), "wlh123qwe", "�ҵ�������������",true));
		
		
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
