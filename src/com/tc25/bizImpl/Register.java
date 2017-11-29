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
 * @Description: ʵ���û�ע��
 * @author Administrator
 * @date 2017��11��21������7:14:59
 * @version 1.0
 */
public class Register implements RegisterInterface {

	InputTools input = InputTools.getInstance();

	UserList userL = UserList.getInstance();
	ArrayList<User> userList = userL.getUserList();
	ArrayList<String> accountList = userL.getAccountList();

	/**
	 * ��д�û�ע��ʵ�ַ���
	 */
	@Override
	public void register() {
		String acc = gainAccount();
		String pwd = gainPassWord();
		
		String userPwdTip = "";
		System.out.println("�����Ƿ���Ҫ����������ʾ(1.��Ҫ  ������������Ϊ����Ҫ)");
		String isNeedTip = input.getString();
		if("1".equals(isNeedTip)){
			userPwdTip = gainUserPwdTip();
		}else{
			userPwdTip = "";
		}
		
		System.out.println("�����Ƿ���Ҫ�����ǳ�(1.��Ҫ ������������ΪĬ��ʹ���˻�����Ϊ�ǳ�)");
		String userTip = "";
		String isNeedName = input.getString();
		if("1".equals(isNeedName)){
			userTip = gainUserTip();
		}else{
			userTip=acc;
		}
		
		userList.add(new User(acc,userTip,userL.userIdCreate(),pwd,userPwdTip,true));
		System.out.println("�û�ע��ɹ���");

	}
	/*
	 * Pattern p = Pattern.compile("^[A-Z]{1}[a-zA-Z0-9_.]{1,16}"); Matcher m =
	 * p.matcher("Ab.1231111#11111111"); System.out.println(m.matches())
	 */

	/**
	 * @Description :ע���û���
	 * @author Administrator
	 * @Date 2017��11��22������1:28:43
	 * @return
	 */
	public String gainAccount() {
		System.out.println("��������Ҫ�������û���");
		String account = "";
		Pattern p = Pattern.compile("[A-Z]{1}[a-zA-Z0-9_.]{1,16}");
		Matcher m = null;

		while (true) {
			account = input.getString();
			m = p.matcher(account);

			if (!m.matches()) {
				System.out.println("�����û���������Ҫ�����������룬лл��");
				continue;
			} else if (m.matches() && accountList.contains(account)) {
				System.out.println("��������û����Ա�����ʹ���ˣ����������룬лл");
				continue;
			} else {
				System.out.println("�û���ע��ɹ���");
				break;
			}
		}
		return account;
	}

	/**
	 * @Title: gainName
	 * @Description: �趨�ǳ�
	 * @param @return
	 *            �趨�ļ�
	 * @return String ��������
	 */
	public String gainUserTip() {

		System.out.println("�������ǳ�");
		String a = "";
		a = input.getString();

		while (true) {
			if (a.length() < 3) {
				System.out.println("�ǳƳ��Ȳ��㣬����������");
			} else if (a.length() >= 3 && a.length() <= 16) {
				System.out.println("�ǳ����óɹ���");
				break;
			} else {
				System.out.println("�ǳƳ���̫��������������");
			}
		}
		return a;
	}
/**
 * @Description :д���û�������ʾ
 * @author Administrator
 * @Date   2017��11��23������12:11:35
 */
	public String gainUserPwdTip() {
		System.out.println("�����뵱ǰ�˻�������ʾ");
		String a = "";
		a = input.getString();

		while (true) {
			if (a.length() > 16) {
				System.out.println("������ʾ���ȹ��������������룡");
				continue;
			} else {
				System.out.println("���óɹ�");
				break;
			}
		}
		return null;
	}

	/**
	 * @Description :¼���û�������
	 * @author Administrator
	 * @Date 2017��11��22������11:59:34
	 * @return
	 */
	public String gainPassWord() {
		System.out.println("����������");
		String pwd = "";
		String pwd2 = "";
		Pattern p = Pattern.compile("[a-zA-Z0-9_.]{1,16}");
		Matcher m = null;

		while (true) {
			pwd = input.getString();
			m = p.matcher(pwd);
			if (m.matches()) {

			} else {
				System.out.println("�����������Ͳ����Ϲ淶�����������룬лл��");
				break;
			}
			System.out.println("���ٴ���������");
			pwd2 = input.getString();
			if (m.matches()) {
				if (pwd2.equals(pwd)) {
					System.out.println("����¼��ɹ�");
					break;
				} else {
					continue;
				}
			} else {
				System.out.println("�ڶ����������벻���Ϲ淶�����������룬лл��");
				continue;
			}
		}
		return pwd2;
	}

}
