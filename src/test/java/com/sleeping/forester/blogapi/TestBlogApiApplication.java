package com.sleeping.forester.blogapi;

import org.springframework.boot.SpringApplication;

public class TestBlogApiApplication {

    public static void main(String[] args) {
        SpringApplication.from(BlogApiApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
