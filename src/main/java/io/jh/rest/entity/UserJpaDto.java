package io.jh.rest.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
public class UserJpaDto {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) //PK 로 ID 생성 후 오라클로 치면 시퀀스 값 넣어줌.
    private String usrId;

    //@Column(name="userPass") //컬럼명이 다를경우 다음과 같이 설정가능
    private String usrPw;
    private String inpDt; //DATE는? <- JPA 심화공부때 참고
    private String cmt ;

}
