package com.tc25.view;

import com.tc25.bizImpl.UserLogin;

/**
 * @Title: LoginView.java
 * @package: com.tc25.view
 * @Description: �����˵��û���¼����
 * @author Administrator
 * @date 2017��11��29������7:38:38
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
