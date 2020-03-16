package com.mzj.springframework.ioc._05_advance.runtimeInject;

import com.mzj.springframework.ioc._05_advance.runtimeInject.environment.Config4RuntimeInject;
import com.mzj.springframework.ioc._05_advance.runtimeInject.environment.MyBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= Config4RuntimeInject.class)
public class RuntimeInjectTest {

  @Autowired
  MyBean myBean;

  @Test
  public void play() {
    System.out.println(myBean);
  }

}
