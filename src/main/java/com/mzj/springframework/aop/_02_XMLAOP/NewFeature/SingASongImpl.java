package com.mzj.springframework.aop._02_XMLAOP.NewFeature;

/**
 * 目标bean实现
 */
public class SingASongImpl implements SingASong {

  @Override
  public void sing(String songName, String songContext) {
    System.out.println("SingASong " + songName + " : " + songContext);
  }
}
