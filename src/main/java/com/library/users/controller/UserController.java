package com.library.users.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/name/{name}")
    public String sampleName(@PathVariable String name) {
        return name;
    }

}
