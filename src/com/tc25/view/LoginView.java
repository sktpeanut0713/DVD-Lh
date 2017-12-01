package com.tc25.view;

import com.tc25.bizImpl.UserLogin;

/**
 * @Title: LoginView.java
 * @package: com.tc25.view
 * @Description: 二级菜单用户登录界面
 * @author Administrator
 * @date 2017年11月29日下午7:38:38
 * @version 1.0
 */
public class LoginView extends View {

	private View mView;

	@Override
	public View showView() {

		UserLogin u = new UserLogin();
		u.login();
		mView = new SplashView();
		return mView;
	}

}
