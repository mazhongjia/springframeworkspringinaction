package com.mzj.springframework.aop._02_XMLAOP.adviceArgs;

public class SingASongImpl implements SingASong {

  @Override
  public void sing(String songName, String songContext) {
    System.out.println("SingASong " + songName + " : " + songContext);
  }
}
