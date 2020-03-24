package com.mzj.springframework.aop._01_SpringDeclarativeAOP.bean.NewFeature;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

/**
 * 切面
 *
 * @Auther: mazhongjia
 * @Date: 2020/3/24 17:57
 * @Version: 1.0
 */
@Aspect
public class NewFeatureAspect {

    /**
     * 通过@DeclareParents注解，将NewFeature接口引入到NewFeature bean中
     *
     * @DeclareParents注解由三部分组成：
     *      1)value属性指定了哪种类型的bean要引入该接口。在本例中，也 就是所有实现Performance的类型。（标记符后面的加号表示 是Performance的所有子类型，而不是Performance本 身。）
     *      2)defaultImpl属性指定了为引入功能提供实现的类。在这里， 我们指定的是DefaultEncoreable提供实现。
     *      3)@DeclareParents注解所标注的静态属性指明了要引入了接 口。在这里，我们所引入的是Encoreable接口。
     */
    @DeclareParents(value="com.mzj.springframework.aop._01_SpringDeclarativeAOP.bean.NewFeature.SingASong+",defaultImpl = NewFeatureImpl.class)
    public static NewFeature newFeature;
}
