package com.mzj.springframework.ioc._03_XmlConfig.setter;

public class CDPlayer {

    private SgtPeppers cd;

    public void setCd(SgtPeppers cd) {
        this.cd = cd;
    }

    public void play() {
        cd.play();
    }

}
