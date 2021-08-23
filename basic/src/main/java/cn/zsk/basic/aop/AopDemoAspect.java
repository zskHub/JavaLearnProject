package cn.zsk.basic.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Author : zsk
 * @CreateTime : 2021-08-19   20:21
 */
@Slf4j
@Aspect
@Component
public class AopDemoAspect {
    @Pointcut("@annotation(cn.zsk.basic.aop.AopDemo)")
    private void pointcut(){}

    @Before("pointcut()")
    public void advice(){
        log.info("进入了自定义注解的方法中");
    }
}
