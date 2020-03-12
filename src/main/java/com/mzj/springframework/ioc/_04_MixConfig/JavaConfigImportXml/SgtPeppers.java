package com.mzj.springframework.ioc._04_MixConfig.JavaConfigImportXml;


public class SgtPeppers {

  private String title = "Sgt. Pepper's Lonely Hearts Club Band";  
  private String artist = "The Beatles";
  
  public void play() {
    System.out.println("_JavaConfigImportXml_Playing " + title + " by " + artist);
  }

}
