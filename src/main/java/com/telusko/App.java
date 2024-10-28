package com.telusko;

import com.telusko.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App


{
    public static void main( String[] args ) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Alien obj1 = context.getBean(Alien.class);
//        obj1.setAge(12);
        System.out.println(obj1.getAge());
        obj1.code();

        Alien obj2 = context.getBean(Alien.class);
//        obj1.setAge(12);
        System.out.println(obj2.getAge());
        obj2.code();

        //        Desktop dt = context.getBean("com1",Desktop.class);
//        dt.compile();
//        Desktop dt1  = context.getBean("com1",Desktop.class);
//        dt1.compile();

//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//
//        Alien obj1 = context.getBean("alien1" , Alien.class);
////        System.out.println(obj1.getAge());
////        obj1.code();
//
////        Alien obj2 = (Alien) context.getBean("alien1");
//////        System.out.println(obj2.getAge());
////        obj2.code();
//        Desktop des = context.getBean("com",Desktop.class);
    }
}
