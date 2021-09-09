package com.example.billing.order;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class OrderConfig {
    @Bean
    CommandLineRunner ordercommandLineRunner(
            OrderRepository repository){
        return args -> {
            Order firstOrder= new Order(
                    202L,
                    true,
                    1,
                    true,
                    true,
                    2000
            );
            Order secondOrder= new Order(
                    203L,
                    true,
                    1,
                    true,
                    false,
                    2500
            );

            repository.saveAll(List.of(firstOrder, secondOrder));
        };
    }
}
