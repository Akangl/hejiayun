package com.study.family_service_platform.service.impl;

import com.study.family_service_platform.bean.TblUserRecord;
import com.study.family_service_platform.mapper.basic.TblUserRecordMapper;
import com.study.family_service_platform.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author Wenkang.Zhou
 * @date 2021-05-19 20:31
 */
@Service("LoginService")
public class LoginServiceImpl implements LoginService {

    @Autowired
    private TblUserRecordMapper tblUserRecordMapper;


    @Override
    public String testUrl() {
        System.out.println("hello");
        return "测试成功";
    }

    @Override
    public TblUserRecord login(String username, String password) {
        return tblUserRecordMapper.login(username, password);
    }
}
