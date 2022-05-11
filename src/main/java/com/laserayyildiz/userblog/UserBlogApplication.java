package com.laserayyildiz.userblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("com.laserayyildiz.userblog.repository")
public class UserBlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserBlogApplication.class, args);
    }

}
