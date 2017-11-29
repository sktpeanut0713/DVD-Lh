package com.tc25.view;

import com.tc25.tools.InputTools;
/**
 * @Title: SplashView.java
 * @package: com.tc25.view
 * @Description: ��ʾ�˵�������
 * @author Administrator
 * @date 2017��11��29������7:38:11
 * @version 1.0
 */
public class SplashView extends View {

	private View mView;
	
	InputTools input = InputTools.getInstance();

	public void showWelcome() {
		for (int i = 0; i < 100; i++) {
			System.out.print("*");
			if (i == 49) {
				System.out.println("\n");
				System.out.println("\t\t��ӭ����������ҫDVD������");
				System.out.println("\n");
			}
		}
	}

	public void showSplashView() {
		System.out.println();
		System.out.println("1.��¼");
		System.out.println("2.ע��");
		System.out.println("3.�˳�");

		int a = 0;
		while (true) {
			System.out.println("��ѡ��ִ����");
			a = input.getInt();
			if (a >= 1 || a <= 3) {
				break;
			}else {
				System.out.println("�������û�д�ѡ������������!");
			}
		}

		switch(a) {
		
		case 1:
			mView = new LoginView();	
			break;
		case 2:
			mView = new RegisterView();
			break;
		case 3:
			System.exit(0);
			break;	
		default:
			break;
		
		
		}
		
		
		
		
		
	}

	@Override
	public View showView() {
		
		showWelcome();		
		showSplashView();
		return mView;
	}

}
