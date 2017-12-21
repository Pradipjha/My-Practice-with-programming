package org.pradip.SpringTestSetGet;

import org.pradip.SpringTest.Restaurant;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringProjectSetGet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context =
				new ClassPathXmlApplicationContext("SpringConfigSetGet.xml");
		
		RestaurantSetGet restaurantObj = (RestaurantSetGet) context.getBean("restaurantBean");
		
		//restaurantObj.greetCustomer();
		restaurantObj.prepareHotDrinkSetGet();
	}

}
