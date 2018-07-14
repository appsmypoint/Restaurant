package co.com.mypoint.restaurant.repository;

import co.com.mypoint.restaurant.domain.Restaurant;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.List;

public interface RestaurantRepository extends Neo4jRepository<Restaurant, String> {

}
