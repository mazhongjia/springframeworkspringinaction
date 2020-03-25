package com.mzj.springframework.aop._02_XMLAOP;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 *  将一个POJO定义为一个切面
 *
 *
 * @Auther: mazhongjia
 * @Date: 2020/3/23 12:26
 * @Version: 1.0
 */
public class Audience2 {


    public void silenceCellPhones(){
        System.out.println("Silenceing cell phones223");
    }

    public void takeSeats(){
        System.out.println("Taking seats223");
    }

    public void applause(){
        System.out.println("CLAP CLAP CLAP223!!!");
    }

    public void demandRefund(){
        System.out.println("Demanding a refund223");
    }
}
