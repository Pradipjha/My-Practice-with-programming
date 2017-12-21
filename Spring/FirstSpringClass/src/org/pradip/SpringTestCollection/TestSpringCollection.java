package org.pradip.SpringTestCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringCollection {

	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfigCollection.xml");

		RestaurantCollection resCollection = (RestaurantCollection) context.getBean("restaurantCollectionBean");

		resCollection.DisplayWaiterList();
	}
}
