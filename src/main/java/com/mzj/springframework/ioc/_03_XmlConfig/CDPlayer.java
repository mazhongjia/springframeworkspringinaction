package com.mzj.springframework.ioc._03_XmlConfig;

public class CDPlayer implements MediaPlayer {

  private CompactDisc cd;

  private String str;

  public CDPlayer(CompactDisc cd,String str) {
    this.cd = cd;
    this.str = str;
  }

  public void play() {
    System.out.println(str);
    cd.play();
  }

}
