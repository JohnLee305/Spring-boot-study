package io.jh.rest.entity;


import com.google.gson.Gson;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

// LOMBOK 기능으로 단순히 아래 3개의 어노테이션을 입력하는것 만드로 getter와 setter가 추가된다.
@Getter
@Setter
@ToString
public class User {
    private String id;
    private String name;
    private String email;

    public User(){
        this.id = UUID.randomUUID().toString();
    };

    public User(String name, String email){
        this();
        this.name = name;
        this.email = email;

    }

    public static User sample(){
        return new User("Lee","see@gmail.com");
     }

    public static void main(String[] args) {
        User user = new User("Jeong","Jeong@gmail.com");
        System.out.println(new Gson().toJson(user));
    }
}
