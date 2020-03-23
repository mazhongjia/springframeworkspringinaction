package com.mzj.springframework.aop;

import com.mzj.springframework.aop._01_SpringDeclarativeAOP.bean.ConcertConfig;
import com.mzj.springframework.aop._01_SpringDeclarativeAOP.bean.Performance;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= ConcertConfig.class)
public class Test {

  @Autowired
  private Performance performance;

  @org.junit.Test
  public void play() {
    performance.perform();
  }

}
