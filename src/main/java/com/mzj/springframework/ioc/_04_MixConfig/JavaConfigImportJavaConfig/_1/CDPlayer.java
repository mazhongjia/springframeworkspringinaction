package com.mzj.springframework.ioc._04_MixConfig.JavaConfigImportJavaConfig._1;

public class CDPlayer {

  private SgtPeppers cd;

  public CDPlayer(SgtPeppers cd) {
    this.cd = cd;
  }

  public void play() {
    cd.play();
  }

}
