package com.mzj.springframework.ioc._02_JavaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan  //将隐式的自动扫码功能关闭，采用JavaConfig中显示的配置
public class CDPlayerConfig {

    @Bean
    public CompactDisc compactDisc() {
        return new SgtPeppers();
    }

    /**
     * 不推荐使用这种方式进行依赖注入：Spring会拦截对compactDisc()的调用并 确保返回的是Spring所创建的bean，也就是Spring本身在调 用compactDisc()时所创建的CompactDiscbean。
     *
     * 同时因为spring默认的bean是单例的，所以多次调用compactDisc()返回的是相同实例，这与看倒的代码不一致，所以不推荐
     * @return
     */
//    @Bean
//    public CDPlayer cdPlayer() {
//        return new CDPlayer(compactDisc());
//    }

    @Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc) {//当 Spring调用cdPlayer()创建CDPlayer bean的时候，它会自动装配 一个CompactDisc到方法中。
        return new CDPlayer(compactDisc);
    }

}
