package com.mzj.springframework.aop._01_SpringDeclarativeAOP.bean;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * 切面
 *
 * 使用@AspectJ注解进行了标注。该注解表 明Audience不仅仅是一个POJO，还是一个切面
 *
 * @Auther: mazhongjia
 * @Date: 2020/3/23 12:26
 * @Version: 1.0
 */
//@Component
@Aspect
public class Audience1 {

    /**
     * 手机静音
     *
     * 通知注解+切点表达式
     */
    @Before("execution(** com.mzj.springframework.aop._01_SpringDeclarativeAOP.bean.Performance.perform(..))")//表演之前
    public void silenceCellPhones(){
        System.out.println("Silenceing cell phones1");
    }

    /**
     * 就坐
     */
    @Before("execution(** com.mzj.springframework.aop._01_SpringDeclarativeAOP.bean.Performance.perform(..))")//表演之前
    public void takeSeats(){
        System.out.println("Taking seats1");
    }

    /**
     * 鼓掌
     */
    @AfterReturning("execution(** com.mzj.springframework.aop._01_SpringDeclarativeAOP.bean.Performance.perform(..))")//表演完成后
    public void applause(){
        System.out.println("CLAP CLAP CLAP1!!!");
    }

    /**
     * 退款
     */
    @AfterThrowing("execution(** com.mzj.springframework.aop._01_SpringDeclarativeAOP.bean.Performance.perform(..))")//表演失败之后
    public void demandRefund(){
        System.out.println("Demanding a refund1");
    }
}
