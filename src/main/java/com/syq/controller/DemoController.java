package com.syq.controller;

import com.syq.fileter.annotation.LoginAnnotation;
import com.syq.model.Test;
import com.syq.service.TestService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author syq
 * @date 2022/4/9 9:16
 * @info：
 * @modified：
 */
@RestController // 相当于Controller和 ResponseBody 两者合并起来的作用
@RequestMapping(value = "/restControllerTest")
public class DemoController {

    @Resource
    private TestService testService;

    @RequestMapping(value ="/test")
    public String test(Integer id){

        return "只返回数据 不返回到页面:RestController";
    }



    @RequestMapping(value ="/save")
    public Test save(Integer id){
       return testService.saveTest();
    }


    @RequestMapping(value ="/getAll")
    @LoginAnnotation
    public List<Test> getAll( ){
        return testService.getAll();
    }
}
