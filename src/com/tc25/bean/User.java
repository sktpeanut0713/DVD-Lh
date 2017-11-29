package com.tc25.bean;
/**
 * @Title: User.java
 * @package: com.tc25.bean
 * @Description: 用户实体类
 * @author Administrator
 * @date 2017年11月20日下午7:56:53
 * @version 1.0
 */
public class User {

	private String userAccount;  		//用户账号       	  String型
	private String userTip; 			//用户昵称         	String型
	private int userId;					//用户id    	int型
	private String userPwd;				//用户密码          	 String
	private String userPwdTip;			//用户密码提示   		String型
	private boolean userStatus;   		//true正常      flase黑名单    boolean型
	
	/**
	 * @Title: getUserAccount 
	 * @Description: 实体类用户类所有字段的getter/setter方法 
	 * @return String    返回类型 
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
	 * <p>Description: 全参构造方法
	 */
	public User(String userAccount, String userTip, int userId, String userPwd, String userPwdTip,
			boolean userStatus) {
		this(userAccount,userTip, userPwd, userPwdTip,userStatus);
		this.userId = userId;
	}
	
	/**
	 * <p>Title: </p> 
	 * <p>Description: 无id构造方法
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
	 * <p>Description: 无参构造方法
	 */
	public User() {
		super();
	}
	
	/* 
	 * <p>Title: toString</p> 
	 * <p>Description: 重写父类的toString方法
	 */
	@Override
	public String toString() {
		return "User [userAccount=" + userAccount + ", userTip=" + userTip + ", userId=" + userId + ", userPwd="
				+ userPwd + ", userPwdTip=" + userPwdTip + ", userStatus=" + userStatus + "]";
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
