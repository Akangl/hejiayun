package com.study.family_service_platform.service;

import com.study.family_service_platform.bean.TblUserRecord;

/**
 * @author 12551
 */
public interface LoginService {
    /**
     * 登录
     *
     * @param username
     * @param password
     * @return
     */
    TblUserRecord login(String username, String password);

    /**
     * 测试接口
     *
     * @return
     */
    String testUrl();
}
