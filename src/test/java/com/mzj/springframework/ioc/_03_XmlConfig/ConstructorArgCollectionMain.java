package com.mzj.springframework.ioc._03_XmlConfig;

import com.mzj.springframework.ioc._03_XmlConfig.constructor.collection.CDPlayer4Collection;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: mazhongjia
 * @Date: 2020/3/10 16:08
 * @Version: 1.0
 */
public class ConstructorArgCollectionMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("com/mzj/springframework/ioc/_03_XmlConfig/constructor/cdplayer-config4Collection.xml");
        CDPlayer4Collection cdPlayer4Collection = (CDPlayer4Collection) classPathXmlApplicationContext.getBean("mediaPlayer");
        cdPlayer4Collection.play();
    }
}
