package com.mzj.springframework.ioc._04_MixConfig.JavaConfigImportXml;

public class CDPlayer {

  private SgtPeppers cd;

  public CDPlayer(SgtPeppers cd) {
    this.cd = cd;
  }

  public void play() {
    cd.play();
  }

}
