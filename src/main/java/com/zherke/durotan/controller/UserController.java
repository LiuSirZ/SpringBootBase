package com.zherke.durotan.controller;

import com.sun.org.apache.xml.internal.security.exceptions.Base64DecodingException;
import lombok.extern.slf4j.Slf4j;
import com.zherke.durotan.bean.BaseResponseVo;
import com.zherke.durotan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.misc.BASE64Decoder;

import java.io.*;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author lwb
 * @create 2018-07-11 9:55
 * @desc a demo for user controller
 **/
@Slf4j
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/hello/test")
    public BaseResponseVo test(Integer userId){
        return userService.findUserList(userId);
    }

    @GetMapping("/hello/find")
    public BaseResponseVo findUserByMapper(){
        return userService.findUserByMapper();
    }

    @PostMapping("/hello/findById")
    public BaseResponseVo findById(Integer userId){
        return userService.findUserById(userId);
    }

}
