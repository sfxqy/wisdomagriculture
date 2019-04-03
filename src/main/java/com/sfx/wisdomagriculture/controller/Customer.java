package com.sfx.wisdomagriculture.controller;


import com.sfx.wisdomagriculture.comment.ResultBean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class Customer {

    @RequestMapping(value = "/test")
    public ResultBean test(){
        return new ResultBean("成功",true);
    }




}
