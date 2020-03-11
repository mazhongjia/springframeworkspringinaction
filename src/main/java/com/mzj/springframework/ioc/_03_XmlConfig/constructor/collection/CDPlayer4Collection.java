package com.mzj.springframework.ioc._03_XmlConfig.constructor.collection;

import com.mzj.springframework.ioc._03_XmlConfig.constructor.MediaPlayer;

import java.util.List;

public class CDPlayer4Collection implements MediaPlayer {

  private String str;

  private List<String> stringList;

  private List<SgtPeppers> sgtPeppersList;

  public CDPlayer4Collection(String str, List<String> stringList, List<SgtPeppers> sgtPeppersList) {
    this.stringList = stringList;
    this.str = str;
    this.sgtPeppersList = sgtPeppersList;
  }

  public void play() {
    System.out.println(stringList);
    System.out.println(sgtPeppersList);
  }

}
