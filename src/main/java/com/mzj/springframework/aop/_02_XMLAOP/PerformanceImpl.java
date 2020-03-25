package com.mzj.springframework.aop._02_XMLAOP;

import org.springframework.stereotype.Component;

/**
 * 业务bean实现
 *
 * @Auther: mazhongjia
 * @Date: 2020/3/23 13:33
 * @Version: 1.0
 */
public class PerformanceImpl implements Performance {

    @Override
    public void perform() {
        System.out.println("PerformanceImpl....");
    }
}
