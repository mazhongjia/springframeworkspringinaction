package com.mzj.springframework.aop._01_SpringDeclarativeAOP.bean.AspectJ;

public aspect CriticAspect {

    public CriticAspect(){

    }

    pointcut performance() : execution(* perform(..));

    afterReturning(): performance(){
        System.out.println(criticIsEngine.getCriticism());
    }

    private CriticismEngine criticIsEngine;

    public void setCriticIsEngine(CriticismEngine criticIsEngine) {
        this.criticIsEngine = criticIsEngine;
    }
}
