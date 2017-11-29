package com.tc25.view;

import com.tc25.tools.InputTools;
/**
 * @Title: SplashView.java
 * @package: com.tc25.view
 * @Description: 显示菜单主界面
 * @author Administrator
 * @date 2017年11月29日下午7:38:11
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
				System.out.println("\t\t欢迎来到王者荣耀DVD音响厅");
				System.out.println("\n");
			}
		}
	}

	public void showSplashView() {
		System.out.println();
		System.out.println("1.登录");
		System.out.println("2.注册");
		System.out.println("3.退出");

		int a = 0;
		while (true) {
			System.out.println("请选择执行项");
			a = input.getInt();
			if (a >= 1 || a <= 3) {
				break;
			}else {
				System.out.println("输入错误，没有此选项请重新输入!");
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
