package com.gopivotal.cf.workshop;

import org.springframework.boot.SpringApplication;

public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Config.class, args);
        System.out.println("jason");
    }
}
