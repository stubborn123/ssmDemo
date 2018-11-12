package com.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * created by ZP
 */

//@Contrller 注解，采用注解的方式表示这个是controller类

@Controller
public class MainCotroller {
    //定义一个请求映射,value为请求的url.值为/说明
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public  String index(){
        //处理完该请求，返回的界面返回index.jsp
        return "index";
    }
}
