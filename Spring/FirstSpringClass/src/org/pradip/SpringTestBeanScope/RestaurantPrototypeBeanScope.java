package org.pradip.SpringTestBeanScope;

public class RestaurantPrototypeBeanScope {

	private String welcomeNote;
	
	public void setWelcomeNote(String welcomeNote){
		this.welcomeNote = welcomeNote;
	}
	
	public void greetCustomer(){
		System.out.println(welcomeNote);
	}
	
	//called when a bean is initialized
	public void init(){
		System.out.println("Bean has been initialised Scope!");
	}
	
	//called when a bean will be destroyed
	public void destroy(){
		System.out.println("Bean will be destroyed Scope!");
	}
}
