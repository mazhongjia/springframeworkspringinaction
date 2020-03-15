package com.mzj.springframework.ioc._05_advance.scope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = { "classpath*:com/mzj/springframework/ioc/_05_advance/scope/scope.xml" })
public class ScopeTest {

//    @Autowired
//    private MyBean myBean;
//
//    @Test
//    public void testScope(){
//
//    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("com/mzj/springframework/ioc/_05_advance/scope/scope.xml");
        MyBean myBean1 = (MyBean) classPathXmlApplicationContext.getBean("myBean123");
        System.out.println(myBean1);
        MyBean myBean2 = (MyBean) classPathXmlApplicationContext.getBean("myBean123");
        System.out.println(myBean2);

        MyBeanPrototype myBeanPrototype1 = (MyBeanPrototype) classPathXmlApplicationContext.getBean("myBean1234");
        System.out.println(myBeanPrototype1);
        MyBeanPrototype myBeanPrototype2 = (MyBeanPrototype) classPathXmlApplicationContext.getBean("myBean1234");
        System.out.println(myBeanPrototype2);;
    }

}
