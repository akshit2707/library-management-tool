package com.library.users.controller;

import com.library.users.entity.UserEntity;
import com.library.users.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
//@RequestMapping("/users")
public class AuthController {

    @Autowired private UserService userService;

    @GetMapping ("/getUser")
    public UserEntity getUserController(){
        log.info("data found");
        return userService.getUser("1");
    }

}
