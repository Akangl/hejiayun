package com.study.family_service_platform.controller;

import com.alibaba.fastjson.JSONObject;
import com.study.family_service_platform.bean.TblUserRecord;
import com.study.family_service_platform.returnJson.ReturnObject;
import com.study.family_service_platform.service.impl.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @author Wenkang.Zhou
 * @date 2021-05-14 22:09
 * @description 登录功能
 */
@RestController
@RequestMapping("/auth")

//跨域配置在controller类的上面添加注解
//@CrossOrigin(origins = "*", allowCredentials = "true", allowedHeaders = "*", methods = {})

public class LoginController {

    @Autowired
    private LoginServiceImpl loginService;

    @RequestMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, HttpSession session) {
        TblUserRecord tblUserRecord = loginService.login(username, password);
        tblUserRecord.setToken(tblUserRecord.getUserName());
        session.setAttribute("userRecord", tblUserRecord);
        ReturnObject returnObject = new ReturnObject(tblUserRecord);
        return JSONObject.toJSONString(returnObject);
    }

    @RequestMapping("/user/info")
    public String getInfo(HttpSession session) {
        System.out.println("session" + session.getAttribute("userRecord"));
        return null;
    }

    
    @RequestMapping("/test")
    @ResponseBody
    public String testUrl() {
        return loginService.testUrl();
    }


    @RequestMapping("/2step-code")
    @ResponseBody
    public boolean twoStepCode() {
        System.out.println("2step-code");
        return true;
    }
}
