package com.lanxin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cyh
 * @date 2019/5/23
 */

@RestController
public class UserController {

    @RequestMapping(value = "say")
    public String say() {
        return "lanxin";
    }
}
