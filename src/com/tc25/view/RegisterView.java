package com.tc25.view;

import com.tc25.bizImpl.Register;
import com.tc25.bizImpl.UserLogin;

/** 
 * @Title: RegisterView.java
 * @package: com.tc25.view
 * @Description: �����˵��û�ע�����
 * @author Administrator
 * @date 2017��11��29������7:38:59
 * @version 1.0
 */
public class RegisterView extends View {

	@Override
	public View showView() {
		
		Register r =new Register();
		r.register();
		
		return null;
	}

}
