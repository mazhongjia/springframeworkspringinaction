package com.mzj.springframework.ioc._05_advance.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "myBean1234")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class MyBeanPrototype {

}
