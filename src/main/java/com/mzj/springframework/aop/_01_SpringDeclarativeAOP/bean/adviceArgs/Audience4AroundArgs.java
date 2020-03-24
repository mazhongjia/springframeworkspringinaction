package com.mzj.springframework.aop._01_SpringDeclarativeAOP.bean.adviceArgs;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.ArrayList;
import java.util.List;

/**
 * 切面
 *
 * 从命名切点到 通知方法的参数转移
 *
 * @Auther: mazhongjia
 * @Date: 2020/3/23 12:26
 * @Version: 1.0
 */
@Aspect
public class Audience4AroundArgs {

   private int songCount = 0;
   private List<String> songList = new ArrayList<>();

    @Pointcut("execution(* com.mzj.springframework.aop._01_SpringDeclarativeAOP.bean.adviceArgs.SingASong.sing(String,String))" + "&& args(songName,songContext)")
    public void trackPlayed(String songName,String songContext){};

    @Before("trackPlayed(songName,songContext)")
    public void countTrack(String songName,String songContext){
        songCount++;
        songList.add(songName);
        System.out.println("已经唱了" + songCount + "首歌曲了，他们是：" + songList);
    }
}
