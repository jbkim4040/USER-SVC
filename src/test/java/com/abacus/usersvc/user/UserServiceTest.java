package com.abacus.usersvc.user;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserServiceTest {

    private UserEntity userEntity;
    private UserService userService;

    @BeforeEach
    void init() {
        userEntity = UserEntity.builder()
                .id("test")
                .name("테스트")
                .email("test@test.com")
                .phone("01012341234")
                .build();
    }

    @Test
    void saveUser() {
        try {
            userService.saveUser(userEntity);
        } catch (Exception e){}
    }

    @Test
    void findUser() {
        String id = "test";

        try{
            UserEntity userEntity = userService.findUser(id);
            System.out.println("user.toString() = " + userEntity.toString());

            Assertions.assertThat(userEntity.getName()).isEqualTo("테스트");
        }catch(Exception e) {}
    }
}