package com.tc25.bizImpl;

import com.tc25.bean.User;
import com.tc25.biz.LoginInterface;
import com.tc25.data.UserList;
import com.tc25.tools.InputTools;

public class UserLogin implements LoginInterface {

	InputTools input = InputTools.getInstance();
	UserList userlist = UserList.getInstance();

	@Override
	public  void login() {

		UserLogin a = new UserLogin();
		User b = a.checkIsContainsName();// 用户输入账号，得到这个账号对应的用户，赋值b
		String c = a.gainUserPwd(b); // 提取当前user账户对应的账户密码,赋值c

		System.out.println("请选择是否需要密码提示  1.需要.  其他任意键为不需要");
		int f = input.getInt();

		if (f == 1) {

			for (int i = 1; i <= 5; i++) {
				System.out.println(b.getUserPwdTip());
				System.out.println("请输入用户密码");
				// 得到用户输入的实际密码，赋值e
				String e = input.getString();
				if (b.getUserPwd().equals(e)) {
					System.out.println("账号密码输入正确");
					break;
				} else {
					System.out.println("密码输入错误");
					i++;
				}
			}
		} else {
			for (int i = 1; i <= 5; i++) {
				System.out.println("请输入用户密码");
				// 得到用户输入的实际密码，赋值e
				String e = input.getString();
				if (b.getUserPwd().equals(e)) {
					System.out.println("账号密码输入正确");
					break;
				} else {
					System.out.println("密码输入错误");
					i++;
					if (i == 3) {
						System.out.println(b.getUserPwdTip());
					}
				}
			}
		}
	}

	/**
	 * @Title: checkIsContainsName
	 * @Description: 判断用户名是否正确
	 * @return 返回当前用户
	 */
	public User checkIsContainsName() {
		String a = "";
		while (true) {
			System.out.println("请输入账号");
			a = input.getString();
			for (User user : userlist.getUserList()) {
				if (user.getUserAccount().equals(a)) {
					return user;
				} else {
					System.out.println("没有此账号，请重新输入");
					continue;
				}
			}
		}
	}

	/**
	 * @Title: gainUserPwd
	 * @Description: 返回此账号对应的user密码
	 * @return String 返回类型，用户输入账户的对应密码
	 */
	public String gainUserPwd(User user) {

		String b = "";
		b = user.getUserPwd();
		return b;
	}
}