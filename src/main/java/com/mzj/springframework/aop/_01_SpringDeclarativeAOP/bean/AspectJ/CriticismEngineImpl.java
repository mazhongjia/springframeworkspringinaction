package com.mzj.springframework.aop._01_SpringDeclarativeAOP.bean.AspectJ;

/**
 * @Auther: mazhongjia
 * @Date: 2020/3/27 12:53
 * @Version: 1.0
 */
public class CriticismEngineImpl implements CriticismEngine {

    public CriticismEngineImpl(){

    }
    @Override
    public String getCriticism() {
        int i = (int) (Math.random() * criticismPool.length);
        return criticismPool[i];
    }

    private String[] criticismPool;

    public void setCriticismPool(String[] criticismPool) {
        this.criticismPool = criticismPool;
    }
}
