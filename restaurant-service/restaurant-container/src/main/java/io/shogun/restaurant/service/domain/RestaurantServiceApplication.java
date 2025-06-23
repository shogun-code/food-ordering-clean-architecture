package io.shogun.restaurant.service.domain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = { "io.shogun.restaurant.service.dataaccess", "io.shogun.dataaccess" })
@EntityScan(basePackages = { "io.shogun.restaurant.service.dataaccess", "io.shogun.dataaccess" })
@SpringBootApplication(scanBasePackages = "io.shogun")
public class RestaurantServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(RestaurantServiceApplication.class, args);
    }
}
