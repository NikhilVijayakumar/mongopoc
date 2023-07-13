package com.nikhil.mongopoc.restaurant.repo

import com.nikhil.mongopoc.restaurant.model.Restaurant
import org.springframework.data.mongodb.repository.MongoRepository

interface RestaurantRepo : MongoRepository<Restaurant, String> {

    fun findByRestaurantId(restaurantId: String): Restaurant?
}