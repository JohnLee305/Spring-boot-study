package io.jh.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//run 기능은 root가 되는 경로에 선언하는것이 권고된다.

@SpringBootApplication
public class UserRestApp  {

    public static void main(String[] args) {
        SpringApplication.run(UserRestApp.class, args);
    }
}
