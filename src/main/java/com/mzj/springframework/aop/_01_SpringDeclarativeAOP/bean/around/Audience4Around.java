package com.mzj.springframework.aop._01_SpringDeclarativeAOP.bean.around;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * 切面
 *
 * 环绕通知
 *
 * @Auther: mazhongjia
 * @Date: 2020/3/23 12:26
 * @Version: 1.0
 */
@Aspect
public class Audience4Around {

    @Pointcut("execution(** com.mzj.springframework.aop._01_SpringDeclarativeAOP.bean.Performance.perform(..)))")
    public void performance(){};

    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint joinPoint){//ProceedingJoinPoint是在通知中通过它来调用被通知的方法

        try {
            System.out.println("around start.....");
            //有意思的是，你可以不调用proceed()方法，从而阻止对被通知方 法的访问
            //也可以在通知中对它进行多次调用。要这样 做的一个场景就是实现重试逻辑
            joinPoint.proceed();
            System.out.println("around end.....");
        } catch (Throwable throwable) {
            System.out.println("around exception.....");
        }
    }
}
