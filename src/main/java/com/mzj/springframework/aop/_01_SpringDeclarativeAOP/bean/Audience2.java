package com.mzj.springframework.aop._01_SpringDeclarativeAOP.bean;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 切面
 *
 * 使用@AspectJ注解进行了标注。该注解表 明Audience不仅仅是一个POJO，还是一个切面
 *
 * 通过将相同的切点统一声明的方式来优化Audience1
 *
 * @Auther: mazhongjia
 * @Date: 2020/3/23 12:26
 * @Version: 1.0
 */
@Component
@Aspect
public class Audience2 {

    /**
     * 定义切点
     *
     * 加@Pointcut注解，我们实际上扩展了切点表达式语言，这样就可 以在任何的切点表达式中使用performance()了
     */
    @Pointcut("execution(** com.mzj.springframework.aop._01_SpringDeclarativeAOP.bean.Performance.perform(..))")//**与 com.mzj之间必须有空格
    public void performance(){
        //performance()方法的实际内容并不重要
    }

    @Before("performance()")
    public void silenceCellPhones(){
        System.out.println("Silenceing cell phones2");
    }

    @Before("performance()")
    public void takeSeats(){
        System.out.println("Taking seats2");
    }

    @AfterReturning("performance()")
    public void applause(){
        System.out.println("CLAP CLAP CLAP2!!!");
    }

    @AfterThrowing("performance()")
    public void demandRefund(){
        System.out.println("Demanding a refund2");
    }
}
