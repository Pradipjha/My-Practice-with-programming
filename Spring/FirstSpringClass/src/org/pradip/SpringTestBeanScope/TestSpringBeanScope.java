package org.pradip.SpringTestBeanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringBeanScope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfigBeanScope.xml");

		((AbstractApplicationContext) context).registerShutdownHook();

		//first object for prototype scope of bean
		RestaurantPrototypeBeanScope restaurantPrototypeBeanScope = (RestaurantPrototypeBeanScope) context.getBean("restaurantPrototypeBeanScopeBean");
		restaurantPrototypeBeanScope.setWelcomeNote("Please welcome to prototype restaurant!"); 
		restaurantPrototypeBeanScope.greetCustomer();

		//second object for prototype scope of bean
		RestaurantPrototypeBeanScope restaurantPrototypeBeanScope1 = (RestaurantPrototypeBeanScope) context.getBean("restaurantPrototypeBeanScopeBean");
		restaurantPrototypeBeanScope1.greetCustomer();


		//first object for singleton scope of bean
		RestaurantSingletonBeanScope restaurantSingletonBeanScope = (RestaurantSingletonBeanScope) context.getBean("restaurantSingletonBeanScopeBean");
		restaurantSingletonBeanScope.setWelcomeNote("Please welcome to singleton restaurant!"); 
		restaurantSingletonBeanScope.greetCustomer();

		//second object for singleton scope of bean
		RestaurantSingletonBeanScope restaurantSingletonBeanScope1 = (RestaurantSingletonBeanScope) context.getBean("restaurantSingletonBeanScopeBean");
		restaurantSingletonBeanScope1.greetCustomer();

		//Object to show Annotation for bean
		RestaurantLifeCycleAnnotation restaurantLifeCycleAnnotation = (RestaurantLifeCycleAnnotation) context.getBean("restaurantLifeCycleAnnotationBean");
		restaurantLifeCycleAnnotation.greetCustomer();

		//Object to show Interface for bean
		RestaurantLifeCycleUsingInterface restaurantLifeCycleUsingInterface = (RestaurantLifeCycleUsingInterface) context.getBean("restaurantLifeCycleUsingInterfaceBean");
		restaurantLifeCycleAnnotation.greetCustomer();
	}

}
