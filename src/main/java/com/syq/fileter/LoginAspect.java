package com.syq.fileter;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author syq
 * @date 2022/4/9 10:45
 * @info：
 * @modified：
 */

@Aspect
@Component
public class LoginAspect{

    private static Logger logger = LoggerFactory.getLogger(LoginAspect.class);

    @Pointcut("@annotation(com.syq.fileter.annotation.LoginAnnotation)")
    public void loginCheckPoint(){

    }
    

    @Before("loginCheckPoint()")
    public void LoginBefor(JoinPoint point){
        logger.info("进入登录拦截之前处理");
    }

    @After("loginCheckPoint()")
    public void LoginAfter(JoinPoint point){
        logger.info("进入登录拦截之后处理");
    }

}
