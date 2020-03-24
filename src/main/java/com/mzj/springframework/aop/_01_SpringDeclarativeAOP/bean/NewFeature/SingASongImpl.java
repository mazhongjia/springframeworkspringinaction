package com.mzj.springframework.aop._01_SpringDeclarativeAOP.bean.NewFeature;
import org.springframework.stereotype.Component;

/**
 * 目标bean实现
 */
@Component
public class SingASongImpl implements SingASong {

  @Override
  public void sing(String songName, String songContext) {
    System.out.println("SingASong " + songName + " : " + songContext);
  }
}
