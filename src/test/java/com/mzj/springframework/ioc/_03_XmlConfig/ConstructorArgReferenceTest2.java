package com.mzj.springframework.ioc._03_XmlConfig;

import com.mzj.springframework.ioc._03_XmlConfig.constructor.MediaPlayer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class ConstructorArgReferenceTest2 {

  @Test
  public void play(){
    ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("com/mzj/springframework/ioc/_03_XmlConfig/constructor/cdplayer-config.xml");
//        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("soundsystem/ConstructorArgReferenceTest-context.xml");
    MediaPlayer mediaPlayer = (MediaPlayer) classPathXmlApplicationContext.getBean("mediaPlayer");
    mediaPlayer.play();
  }

}
