package com.mzj.springframework.ioc._03_XmlConfig;

import com.mzj.springframework.ioc._03_XmlConfig.setter.CDPlayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: mazhongjia
 * @Date: 2020/3/10 16:08
 * @Version: 1.0
 */
public class SetterMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("com/mzj/springframework/ioc/_03_XmlConfig/setter/cdplayer-config.xml");
//        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("soundsystem/ConstructorArgReferenceTest-context.xml");
        CDPlayer cdPlayer = (CDPlayer) classPathXmlApplicationContext.getBean("mediaPlayer");
        cdPlayer.play();
    }
}
