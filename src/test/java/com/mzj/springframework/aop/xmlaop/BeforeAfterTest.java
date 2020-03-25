package com.mzj.springframework.aop.xmlaop;

import com.mzj.springframework.aop._02_XMLAOP.Performance;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Auther: mazhongjia
 * @Date: 2020/3/25 13:04
 * @Version: 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:com/mzj/springframework/aop/_02_XMLAOP/XMLAOP.xml" })
public class BeforeAfterTest {

    @Autowired
    private Performance performance;

    @Test
    public void play() {
        performance.perform();
    }
}
