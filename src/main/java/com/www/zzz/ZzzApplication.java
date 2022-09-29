package com.www.zzz;

import com.www.zzz.dto.account.Account;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.mongodb.core.MongoTemplate;

@SpringBootApplication
public class ZzzApplication {

//    @Autowired
//    private MongoTemplate mongoTemplate;

    public static void main(String[] args) {
        SpringApplication.run(ZzzApplication.class, args);
    }

//    @Bean
//    public ApplicationRunner applicationRunner() {
//        return args -> {
//            Account account = new Account();
//            account.setEmail("wilee@des.com");
//            account.setUsername("zzz");
//
//            mongoTemplate.insert(account);
//        };
//    }

}
