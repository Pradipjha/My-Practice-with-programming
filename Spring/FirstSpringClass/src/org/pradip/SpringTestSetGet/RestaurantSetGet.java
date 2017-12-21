package org.pradip.SpringTestSetGet;

public class RestaurantSetGet {

	IHotDrinkSetGet hotDrinkSetGet;
	
	public void setHotDrinkSetGet(IHotDrinkSetGet hotDrinkSetGet){
		this.hotDrinkSetGet = hotDrinkSetGet;
	}
	
	public void prepareHotDrinkSetGet(){
		hotDrinkSetGet.prepareHotDrinkSetGet();
	}
}
