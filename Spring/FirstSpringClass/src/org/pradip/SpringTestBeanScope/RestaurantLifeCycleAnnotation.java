package org.pradip.SpringTestBeanScope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class RestaurantLifeCycleAnnotation {

	private String welcomeNote;

	public void setWelcomeNote(String welcomeNote){
		this.welcomeNote = welcomeNote;
	}

	public void greetCustomer(){
		System.out.println(welcomeNote);
	}

	@PostConstruct
	//called when a bean is initialized
	public void init(){
		System.out.println("Bean has been initialised Annotation!");
	}
	
	@PreDestroy
	//called when a bean will be destroyed
	public void destroy(){
		System.out.println("Bean will be destroyed Annotation!");
	}
}
