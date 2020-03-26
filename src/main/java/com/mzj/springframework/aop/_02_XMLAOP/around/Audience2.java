package com.mzj.springframework.aop._02_XMLAOP.around;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 *  将一个POJO定义为一个切面
 *
 *
 * @Auther: mazhongjia
 * @Date: 2020/3/23 12:26
 * @Version: 1.0
 */
public class Audience2 {


    public void watchPerformance(ProceedingJoinPoint joinPoint){

        try{
            System.out.println("表演之前.....");
            joinPoint.proceed();//执行被通知的方法
            System.out.println("表演成功后.....");
        }catch (Throwable e){
            System.out.println("表演失败后....");
        }
    }

}
