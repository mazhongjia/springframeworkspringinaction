package com.mzj.springframework.ioc._04_MixConfig.JavaConfigImportJavaConfig._2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SoundSystemConfig.class)
public class CDPlayerTest {

    @Autowired
    private CDPlayer player;

    @Test
    public void play() {
        player.play();
    }

}
