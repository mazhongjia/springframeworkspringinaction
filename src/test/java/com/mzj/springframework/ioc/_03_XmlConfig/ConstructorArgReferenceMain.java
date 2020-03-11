package com.mzj.springframework.ioc._03_XmlConfig;

import com.mzj.springframework.ioc._03_XmlConfig.constructor.MediaPlayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: mazhongjia
 * @Date: 2020/3/10 16:08
 * @Version: 1.0
 */
public class ConstructorArgReferenceMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("com/mzj/springframework/ioc/_03_XmlConfig/constructor/cdplayer-config.xml");
//        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("soundsystem/ConstructorArgReferenceTest-context.xml");
        MediaPlayer mediaPlayer = (MediaPlayer) classPathXmlApplicationContext.getBean("mediaPlayer");
        mediaPlayer.play();
    }
}
