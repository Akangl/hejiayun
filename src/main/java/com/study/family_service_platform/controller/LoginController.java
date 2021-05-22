package com.study.family_service_platform.controller;

import com.study.family_service_platform.bean.TblUserRecord;
import com.study.family_service_platform.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Wenkang.Zhou
 * @date 2021-05-14 22:09
 */
@RestController
@RequestMapping("/auth")

//跨域配置在controller类的上面添加注解
//@CrossOrigin(origins = "*", allowCredentials = "true", allowedHeaders = "*", methods = {})

public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password) {

        TblUserRecord tblUserRecord = loginService.login(username, password);
        System.out.println("username===" + username);
        System.out.println("password===" + password);
        return "";
    }

    @RequestMapping("/2step-code")
    public boolean twoStepCode() {
        System.out.println("2step-code");
        return true;
    }
}
