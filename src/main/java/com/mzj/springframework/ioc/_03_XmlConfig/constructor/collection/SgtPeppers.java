package com.mzj.springframework.ioc._03_XmlConfig.constructor.collection;

public class SgtPeppers {

  private String title = "title for collection";
  private String artist = "The Beatles";
  
  public String toString() {
    return "Playing " + title + " by " + artist + this.hashCode();
  }

}
