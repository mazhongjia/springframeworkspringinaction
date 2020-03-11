package com.mzj.springframework.ioc._03_XmlConfig.setter;

public class SgtPeppers {

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }

}
