package com.tc25.bizImpl;

import java.util.ArrayList;

import com.tc25.bean.User;
import com.tc25.biz.LoginInterface;
import com.tc25.data.UserList;
import com.tc25.tools.InputTools;

public class UserLogin implements LoginInterface {

	InputTools input = InputTools.getInstance();
	UserList userl = UserList.getInstance();

	@Override
	public void login() {

		UserLogin a = new UserLogin();
		User b = a.checkIsContainsAccount();// �û������˺ţ��õ�����˺Ŷ�Ӧ���û�����ֵb
		String c = a.gainUserPwd(b); // ��ȡ��ǰuser�˻���Ӧ���˻�����,��ֵc

		System.out.println("��ѡ���Ƿ���Ҫ������ʾ  1.��Ҫ.  ���������Ϊ����Ҫ");
		int f = input.getInt();

		if (f == 1) {

			for (int i = 1; i <= 5; i++) {
				System.out.println("������ʾΪ:\"" + b.getUserPwdTip() + "\",����ϸ����");
				System.out.println("�������û�����");
				// �õ��û������ʵ�����룬��ֵe
				String e = input.getString();
				if (b.getUserPwd().equals(e)) {
					System.out.println("�˺�����������ȷ");
					break;
				} else {
					System.out.println("�����������");
				}
			}
		} else {
			for (int i = 1; i <= 5; i++) {
				System.out.println("�������û�����");
				// �õ��û������ʵ�����룬��ֵe
				String e = input.getString();
				if (b.getUserPwd().equals(e)) {
					System.out.println("�˺�����������ȷ");
					break;
				} else {
					System.out.println("�����������");
					if (i >= 3) {
						System.out.println("������ʾΪ:" + b.getUserPwdTip());
					}
				}
			}
		}
	}

	/**
	 * @Title: checkIsContainsName
	 * @Description: �ж��û����Ƿ���ȷ
	 * @return ���ص�ǰ�û�
	 */
	public User checkIsContainsAccount() {
		String a = "";
		while (true) {
			System.out.println("�������˺�");
			a = input.getString();
			for (User user : userl.getUserList()) {
				if (user.getUserAccount().equals(a)) {
					return user;
				}
			}
			System.out.println("û�д��˺ţ�����������");
		}
	}

	/**
	 * @Title: gainUserPwd
	 * @Description: ���ش��˺Ŷ�Ӧ��user����
	 * @return String �������ͣ��û������˻��Ķ�Ӧ����
	 */
	public String gainUserPwd(User user) {

		String b = "";
		b = user.getUserPwd();
		return b;
	}
}