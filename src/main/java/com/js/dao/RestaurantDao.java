package com.js.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.js.entity.Restaurant;

@Repository
public class RestaurantDao {

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public Restaurant getRestaurant(int restaurantNo) {
		System.out.println(entityManagerFactory);
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		System.out.println(entityManager);
		return entityManager.find(Restaurant.class, restaurantNo);
	}

	

}
