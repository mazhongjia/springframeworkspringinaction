package com.mzj.springframework.aop._01_SpringDeclarativeAOP.bean.NewFeature;

/**
 * 增加的新功能实现
 *
 * @Auther: mazhongjia
 * @Date: 2020/3/24 17:55
 * @Version: 1.0
 */
public class NewFeatureImpl implements NewFeature{

    @Override
    public void newFeature() {
        System.out.println("增加新功能。。。");
    }
}
