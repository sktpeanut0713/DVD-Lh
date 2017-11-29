package com.tc25.bizImpl;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.tc25.bean.User;
import com.tc25.biz.RegisterInterface;
import com.tc25.data.UserList;
import com.tc25.tools.InputTools;

/**
 * @Title: Register.java
 * @package: com.tc25.bizImpl
 * @Description: 实现用户注册
 * @author Administrator
 * @date 2017年11月21日下午7:14:59
 * @version 1.0
 */
public class Register implements RegisterInterface {

	InputTools input = InputTools.getInstance();

	UserList userL = UserList.getInstance();
	ArrayList<User> userList = userL.getUserList();
	ArrayList<String> accountList = userL.getAccountList();

	/**
	 * 重写用户注册实现方法
	 */
	@Override
	public void register() {
		String acc = gainAccount();
		String pwd = gainPassWord();
		
		String userPwdTip = "";
		System.out.println("请问是否需要输入密码提示(1.需要  输入其他任意为不需要)");
		String isNeedTip = input.getString();
		if("1".equals(isNeedTip)){
			userPwdTip = gainUserPwdTip();
		}else{
			userPwdTip = "";
		}
		
		System.out.println("请问是否需要输入昵称(1.需要 输入其他任意为默认使用账户名作为昵称)");
		String userTip = "";
		String isNeedName = input.getString();
		if("1".equals(isNeedName)){
			userTip = gainUserTip();
		}else{
			userTip=acc;
		}
		
		userList.add(new User(acc,userTip,userL.userIdCreate(),pwd,userPwdTip,true));
		System.out.println("用户注册成功！");

	}
	/*
	 * Pattern p = Pattern.compile("^[A-Z]{1}[a-zA-Z0-9_.]{1,16}"); Matcher m =
	 * p.matcher("Ab.1231111#11111111"); System.out.println(m.matches())
	 */

	/**
	 * @Description :注册用户名
	 * @author Administrator
	 * @Date 2017年11月22日上午1:28:43
	 * @return
	 */
	public String gainAccount() {
		System.out.println("请输入想要创建的用户名");
		String account = "";
		Pattern p = Pattern.compile("[A-Z]{1}[a-zA-Z0-9_.]{1,16}");
		Matcher m = null;

		while (true) {
			account = input.getString();
			m = p.matcher(account);

			if (!m.matches()) {
				System.out.println("输入用户名不符合要求，请重新输入，谢谢！");
				continue;
			} else if (m.matches() && accountList.contains(account)) {
				System.out.println("您输入的用户名以被别人使用了，请重新输入，谢谢");
				continue;
			} else {
				System.out.println("用户名注册成功！");
				break;
			}
		}
		return account;
	}

	/**
	 * @Title: gainName
	 * @Description: 设定昵称
	 * @param @return
	 *            设定文件
	 * @return String 返回类型
	 */
	public String gainUserTip() {

		System.out.println("请输入昵称");
		String a = "";
		a = input.getString();

		while (true) {
			if (a.length() < 3) {
				System.out.println("昵称长度不足，请重新输入");
			} else if (a.length() >= 3 && a.length() <= 16) {
				System.out.println("昵称设置成功！");
				break;
			} else {
				System.out.println("昵称长度太长，请重新输入");
			}
		}
		return a;
	}
/**
 * @Description :写入用户密码提示
 * @author Administrator
 * @Date   2017年11月23日上午12:11:35
 */
	public String gainUserPwdTip() {
		System.out.println("请输入当前账户密码提示");
		String a = "";
		a = input.getString();

		while (true) {
			if (a.length() > 16) {
				System.out.println("密码提示长度过长，请重新输入！");
				continue;
			} else {
				System.out.println("设置成功");
				break;
			}
		}
		return null;
	}

	/**
	 * @Description :录入用户的密码
	 * @author Administrator
	 * @Date 2017年11月22日下午11:59:34
	 * @return
	 */
	public String gainPassWord() {
		System.out.println("请输入密码");
		String pwd = "";
		String pwd2 = "";
		Pattern p = Pattern.compile("[a-zA-Z0-9_.]{1,16}");
		Matcher m = null;

		while (true) {
			pwd = input.getString();
			m = p.matcher(pwd);
			if (m.matches()) {

			} else {
				System.out.println("输入密码类型不符合规范，请重新输入，谢谢！");
				break;
			}
			System.out.println("请再次输入密码");
			pwd2 = input.getString();
			if (m.matches()) {
				if (pwd2.equals(pwd)) {
					System.out.println("密码录入成功");
					break;
				} else {
					continue;
				}
			} else {
				System.out.println("第二次输入密码不符合规范，请重新输入，谢谢！");
				continue;
			}
		}
		return pwd2;
	}

}
