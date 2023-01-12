package com.yiwu.usercenterserver.controller;

import com.yiwu.common.Resp;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {


    @PostMapping("/isValidUserByToken")
    public Resp<Boolean> isValidUserByToken(@RequestParam String token) {
        return Resp.success();
    }
}
