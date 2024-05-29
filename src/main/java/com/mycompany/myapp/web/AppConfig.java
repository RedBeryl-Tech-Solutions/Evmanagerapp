package com.mycompany.myapp.service;
import com.mycompany.myapp.repository.SubscriptionDetailsRepository;
import com.mycompany.myapp.service.velocitytemp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

   @Bean
   public velocitytemp velocitytemp(SubscriptionDetailsRepository subscriptionDetailsRepository) {
       return new velocitytemp( subscriptionDetailsRepository );
   }
}



