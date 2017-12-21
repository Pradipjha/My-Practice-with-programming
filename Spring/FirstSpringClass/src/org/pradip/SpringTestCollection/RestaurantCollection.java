package org.pradip.SpringTestCollection;

import java.util.List;

public class RestaurantCollection {

	private List waiterList;
	
	public void setWaiterList(List waiterList){
		this.waiterList = waiterList;
	}
	
	public void DisplayWaiterList(){
		System.out.println("All waiter's working in this restaurant are :" + waiterList);
	}
}
