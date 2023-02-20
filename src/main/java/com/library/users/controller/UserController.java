package com.library.users.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class UserController {
    @GetMapping("/health")
    public String health() {
        log.info("Working fine");
        return ":::::Status check:::::\n" + "::::::::::*:::::::::::\n" + ":::::::::*:*::::::::::\n"
                + "::::::::*:*:*:::::::::\n" + ":::::::::*:*::::::::::\n" + "::::::::::*:::::::::::\n"
                + "::::::Scan Done:::::::";
    }

}
