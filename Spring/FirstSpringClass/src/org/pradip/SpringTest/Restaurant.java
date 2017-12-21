package org.pradip.SpringTest;

public class Restaurant {

	/*String welcomeNote;
	
	
	public String getWelcomeNote() {
		return welcomeNote;
	}

	public void setWelcomeNote(String welcomeNote) {
		this.welcomeNote = welcomeNote;
	}

	public void greetCustomer(){
		System.out.println(getWelcomeNote());
	}*/
	
	IHotDrink hotDrink;
	
	Restaurant(IHotDrink hotDrink){
		this.hotDrink = hotDrink;
	}
	
	public void prepareHotDrink(){
		hotDrink.prepareHotDrink();
	}
}
