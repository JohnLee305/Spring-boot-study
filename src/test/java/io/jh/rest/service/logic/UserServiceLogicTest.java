package io.jh.rest.service.logic;

import io.jh.rest.entity.User;
import io.jh.rest.service.UserService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

// 보통 이름은 테스트 하고자 하는 클래스의 이름 뒤에 TEST를 붙인다.
@SpringBootTest //해당 어노테이션으로 테스트 클래스 지정
public class UserServiceLogicTest {

    @Autowired //단위테스트에서는 오토와이어드로만 가능
    private UserService userService;

    private User kim;
    private User lee;



    @BeforeEach
    public void startUp(){
        //테스트 시작 전에 초기화 데이터 넣음...
        this.kim = new User("kim","kim11@@ggggg.mmm");
        this.lee = new User("lee","lee11@@ggggg.mmm");
        this.userService.register(kim);
        this.userService.register(lee);
    }

    @Test
    public void registerTest(){

        User sample = User.sample();
        assertThat(this.userService.register(sample )).isEqualTo(sample.getId());
        assertThat(this.userService.findAll().size()).isEqualTo(3);
        this.userService.remove(sample.getId());

    }

    @Test
    public void find(){
        assertThat(this.userService.find(lee.getId())).isNotNull();
        assertThat(this.userService.find(lee.getId()).getEmail()).isEqualTo(lee.getEmail() );

    }

    @AfterEach
    public void cleanUp(){
         //테스트에 쓰였던 임의의 데이터 삭제
        this.userService.remove(kim.getId());
        this.userService.remove(lee.getId());

    }

}
