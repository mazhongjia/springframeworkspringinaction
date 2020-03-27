package com.mzj.springframework.aop._01_SpringDeclarativeAOP.bean.AspectJ;

public aspect CriticAspect {

    public CriticAspect(){

    }

    pointcut performance() : execution(* perform(..));

    afterReturning(): performance(){
        System.out.println(criticismEngine.getCriticism());
    }

    private CriticismEngine criticismEngine;

    public void setCriticismEngine(CriticismEngine criticismEngine) {
        this.criticismEngine = criticismEngine;
    }
}
