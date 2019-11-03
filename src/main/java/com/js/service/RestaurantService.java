package com.js.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.js.dao.RestaurantDao;
import com.js.entity.Restaurant;

@Service
public class RestaurantService {
	
	@Autowired
	private RestaurantDao restaurantDao;
	
	@Transactional
	public Restaurant getRestaurant(int restaurantNo) {
		return restaurantDao.getRestaurant(restaurantNo);
	}

}
