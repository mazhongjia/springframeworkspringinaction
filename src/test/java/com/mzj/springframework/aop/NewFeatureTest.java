package com.mzj.springframework.aop;

import com.mzj.springframework.aop._01_SpringDeclarativeAOP.bean.NewFeature.NewFeature;
import com.mzj.springframework.aop._01_SpringDeclarativeAOP.bean.NewFeature.NewFeatureConfig;
import com.mzj.springframework.aop._01_SpringDeclarativeAOP.bean.NewFeature.SingASong;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Auther: mazhongjia
 * @Date: 2020/3/24 14:13
 * @Version: 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= NewFeatureConfig.class)
public class NewFeatureTest {

    @Autowired
    private SingASong singASong;

    @org.junit.Test
    public void songTest() {
        String song1 = "let it go...let it go...";
        String song2 = "我爱你中国....我爱你中国....";
        singASong.sing("Let It Go",song1);
        singASong.sing("我爱你中国",song2);
        ((NewFeature)singASong).newFeature();
    }
}
