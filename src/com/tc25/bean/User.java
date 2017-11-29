package com.tc25.bean;
/**
 * @Title: User.java
 * @package: com.tc25.bean
 * @Description: �û�ʵ����
 * @author Administrator
 * @date 2017��11��20������7:56:53
 * @version 1.0
 */
public class User {

	private String userAccount;  		//�û��˺�       	  String��
	private String userTip; 			//�û��ǳ�         	String��
	private int userId;					//�û�id    	int��
	private String userPwd;				//�û�����          	 String
	private String userPwdTip;			//�û�������ʾ   		String��
	private boolean userStatus;   		//true����      flase������    boolean��
	
	/**
	 * @Title: getUserAccount 
	 * @Description: ʵ�����û��������ֶε�getter/setter���� 
	 * @return String    �������� 
	 */
	public String getUserAccount() {
		return userAccount;
	}
	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}
	public String getUserName() {
		return userTip;
	}
	public void setUserName(String userName) {
		this.userTip = userName;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getUserPwdTip() {
		return userPwdTip;
	}
	public void setUserPwdTip(String userPwdTip) {
		this.userPwdTip = userPwdTip;
	}
	public boolean isUserStatus() {
		return userStatus;
	}
	public void setUserStatus(boolean userStatus) {
		this.userStatus = userStatus;
	}
	
	/**
	 * <p>Title: </p> 
	 * <p>Description: ȫ�ι��췽��
	 */
	public User(String userAccount, String userTip, int userId, String userPwd, String userPwdTip,
			boolean userStatus) {
		this(userAccount,userTip, userPwd, userPwdTip,userStatus);
		this.userId = userId;
	}
	
	/**
	 * <p>Title: </p> 
	 * <p>Description: ��id���췽��
	 */
	public User(String userAccount, String userTip, String userPwd, String userPwdTip, boolean userStatus) {
		super();
		this.userAccount = userAccount;
		this.userTip = userTip;
		this.userPwd = userPwd;
		this.userPwdTip = userPwdTip;
		this.userStatus = userStatus;
	}
	
	/**
	 * <p>Title: </p> 
	 * <p>Description: �޲ι��췽��
	 */
	public User() {
		super();
	}
	
	/* 
	 * <p>Title: toString</p> 
	 * <p>Description: ��д�����toString����
	 */
	@Override
	public String toString() {
		return "User [userAccount=" + userAccount + ", userTip=" + userTip + ", userId=" + userId + ", userPwd="
				+ userPwd + ", userPwdTip=" + userPwdTip + ", userStatus=" + userStatus + "]";
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
