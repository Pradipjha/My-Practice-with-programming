package org.pradip.SpringTestBeanScope;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class RestaurantLifeCycleUsingInterface implements InitializingBean, DisposableBean{

	private String welcomeNote;

	public void setWelcomeNote(String welcomeNote){
		this.welcomeNote = welcomeNote;
	}

	public void greetCustomer(){
		System.out.println(welcomeNote);
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Bean will be destroyed Interface!");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Bean has been initialized Interface!");
	}
}
