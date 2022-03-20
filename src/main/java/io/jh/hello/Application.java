package io.jh.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// 해당 어노테이션은 다음과 같은 기능을 포함함.
//SpringBootConfiguration
//EnableAutoConfiguration
//ComponnetScan

public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
