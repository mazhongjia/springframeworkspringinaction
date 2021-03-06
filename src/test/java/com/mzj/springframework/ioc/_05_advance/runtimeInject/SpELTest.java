package com.mzj.springframework.ioc._05_advance.runtimeInject;

import com.mzj.springframework.ioc._05_advance.runtimeInject.spEL.MyBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Auther: mazhongjia
 * @Date: 2020/3/16 14:02
 * @Version: 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:com/mzj/springframework/ioc/_05_advance/spEL/spEL.xml" })
public class SpELTest {

    @Autowired
    MyBean myBean;

    @Test
    public void test(){
        System.out.println(myBean);
    }
}
