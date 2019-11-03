package com.js.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.js.config.PersistenceConfig;
import com.js.entity.Restaurant;
import com.js.service.RestaurantService;

public class RestaurantTest {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context=new AnnotationConfigApplicationContext(PersistenceConfig.class);
		RestaurantService service=context.getBean(RestaurantService.class, "restaurantService");
		Restaurant restaurant=service.getRestaurant(1);
		System.out.println(restaurant);
	}

}
