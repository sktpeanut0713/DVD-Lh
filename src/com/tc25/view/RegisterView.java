package com.tc25.view;

import com.tc25.bizImpl.Register;


/**
 * @Title: RegisterView.java
 * @package: com.tc25.view
 * @Description: 二级菜单用户注册界面
 * @author Administrator
 * @date 2017年11月29日下午7:38:59
 * @version 1.0
 */
public class RegisterView extends View {

	private View mView;
	
	@Override
	public View showView() {

		Register r = new Register();
		r.register();
		
		mView = new SplashView();
		return mView;
	}

}
