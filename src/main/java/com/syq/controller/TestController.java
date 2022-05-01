package com.syq.controller;

import com.syq.model.Test;
import com.syq.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author syq
 * @date 2022/4/8 22:13
 * @info：
 * @modified：
 */
@Controller
@RequestMapping(value = "/controllerTest")
public class TestController {


    @Autowired   // @Autowired 属于spring   @Resource属于j2ee  这两中形式都可以
    private TestService testService;

    @RequestMapping(value ="/index")  //跳转到页面  如果直接返回数据则需要加上注解@ResponseBody
    public String index(Model model, Integer id){

        String hello = testService.hello(id);

        model.addAttribute("hello", hello);
        return "index";
    }


    @RequestMapping(value ="/responsbodyTest" ) // 默认请求方式 为get  可以通过method 指定 不同的请求方式 post put get 等  @RequestMapping(value ="/responsbodyTest" ,method = RequestMethod.POST)
    @ResponseBody  //将对象转为json方式
    public String responsbodyTest(Model model, Integer id){

        String hello = testService.hello(id);

        model.addAttribute("hello", hello);
        return "只返回数据 不返回到页面:Controller";
    }

    @RequestMapping(value ="/responsbodyBeanTest" )
    @ResponseBody  //将对象转为json方式
    public Test responsbodyBeanTest(Integer id){

        Test test = testService.getTest(id);

        return test;
    }
}
