package com.mzj.springframework.ioc._04_MixConfig.XmlImportJavaConfig;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Auther: mazhongjia
 * @Date: 2020/3/10 16:08
 * @Version: 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:com/mzj/springframework/ioc/_04_MixConfig/cd-config1.xml" })
public class CDPlayerTest {
//    public static void main(String[] args) {
//        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("com/mzj/springframework/ioc/_04_MixConfig/cd-config1.xml");
//        CDPlayer4Collection cdPlayer4Collection = (CDPlayer4Collection) classPathXmlApplicationContext.getBean("mediaPlayer");
//        cdPlayer4Collection.play();
//    }

    @Autowired
    private CDPlayer player;

    @Test
    public void play() {
        player.play();
    }
}
