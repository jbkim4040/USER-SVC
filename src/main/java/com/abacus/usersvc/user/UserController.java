package com.abacus.usersvc.user;

import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@Api(tags = {"User"})
@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;


    @PostMapping("/login")
    public void login(@RequestBody UserEntity userEntity) {

    }


    @PostMapping("/")
    public void signUp(@RequestBody UserEntity userEntity) throws Exception{
        userService.saveUser(userEntity);
    }

    @GetMapping("/")
    public UserEntity findUser(String id) throws Exception{
        return userService.findUser(id);
    }
}
