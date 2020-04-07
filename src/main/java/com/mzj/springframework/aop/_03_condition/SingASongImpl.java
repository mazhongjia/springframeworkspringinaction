package com.mzj.springframework.aop._03_condition;
import org.springframework.stereotype.Component;

@Component
public class SingASongImpl implements SingASong {

  @Override
  public void sing(String songName, String songContext) {
    System.out.println("SingASong " + songName + " : " + songContext);
  }
}
