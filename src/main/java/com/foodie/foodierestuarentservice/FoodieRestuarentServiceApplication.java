package com.foodie.foodierestuarentservice;

import com.foodie.foodierestuarentservice.model.Restuarent;
import com.foodie.foodierestuarentservice.repository.RestuarentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableDiscoveryClient
@EnableMongoRepositories
public class FoodieRestuarentServiceApplication implements CommandLineRunner{
    @Autowired
    private RestuarentRepository restuarentRepository;

	public static void main(String[] args) {
		SpringApplication.run(FoodieRestuarentServiceApplication.class, args);
	}

    @Override
    public void run(String... strings) throws Exception {
        restuarentRepository.save(new Restuarent("Indian Tadka", "Indian"));
        restuarentRepository.save(new Restuarent("Macroni Grill", "Italian"));
    }
}