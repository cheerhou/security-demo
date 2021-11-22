package com.cheerhou.securitydemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @date: 2021/11/22
 * @author: hcj
 */
@Controller
public class BizpageController {

    /**
     * 登录
     *
     * @param username
     * @param password
     * @return java.lang.String
     * @author hcj
     * @date 2021/11/22 3:29 下午
     */
    @PostMapping("/login")
    public String index(String username, String password) {
        return "index";  //index.html
    }

    /**
     * 日志管理
     *
     * @return java.lang.String
     * @author hcj
     * @date 2021/11/22 3:29 下午
     */
    @GetMapping("/syslog")
    public String showOrder() {
        return "syslog"; //syslog.html
    }

    /**
     * 用户管理
     *
     * @return java.lang.String
     * @author hcj
     * @date 2021/11/22 3:30 下午
     */
    @GetMapping("/sysuser")
    public String addOrder() {
        return "sysuser"; //sysuser.html
    }

    /**
     * 具体业务一
     *
     * @return java.lang.String
     * @author hcj
     * @date 2021/11/22 3:30 下午
     */
    @GetMapping("/biz1")
    public String updateOrder() {
        return "biz1";  //biz1.html
    }

    /**
     * 具体业务二
     *
     * @return java.lang.String
     * @author hcj
     * @date 2021/11/22 3:30 下午
     */
    @GetMapping("/biz2")
    public String deleteOrder() {
        return "biz2";  //biz2.html
    }
}