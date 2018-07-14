package co.com.mypoint.restaurant.controller;

import co.com.mypoint.restaurant.domain.Restaurant;
import co.com.mypoint.restaurant.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestaurantController {

    @Autowired
    private RestaurantRepository repository;

    @PostMapping("/addRestaurant")
    public String addrestaurant(@RequestBody Restaurant restaurant){
        repository.save(restaurant);
        return "restaurant Added";
    }

    @GetMapping("/getRestaurants")
    public List<Restaurant> getRestaurants(){
        return (List<Restaurant>) repository.findAll();
    }


    @DeleteMapping("/deleteRestaurant/{id}")
    public String deleteRestaurant(@PathVariable String id){
        repository.deleteById(id);
        return "Restaurant delete with id : " + id;

    }

}


