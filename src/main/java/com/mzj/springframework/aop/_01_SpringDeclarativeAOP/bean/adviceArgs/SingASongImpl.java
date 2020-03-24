package com.mzj.springframework.aop._01_SpringDeclarativeAOP.bean.adviceArgs;
import org.springframework.stereotype.Component;

@Component
public class SingASongImpl implements SingASong {


  @Override
  public void sing(String songName, String songContext) {
    System.out.println("SingASong " + songName + " : " + songContext);
  }
}
