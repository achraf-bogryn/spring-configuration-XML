package com.telusko.config;

import com.telusko.Alien;
import com.telusko.Compuetr;
import com.telusko.Desktop;
import com.telusko.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.telusko")
public class AppConfig {
//    in java configuration bean name in objet name in this case objet name is desktop
//    or we can use name attribute inside notation bean
//we use @Qualifier keyword for we give one object an periority
//    Or we can use primary also work
//    @Bean(name = "alien1")
//    public Alien alien( Compuetr com){ //@Qualifier("lap1"
//        Alien obj = new Alien();
//        obj.setAge(23);
//        obj.setCom(com);
//        return obj;
//    }
//    @Bean(name = "com1")
////    @Scope("prototype")
//    public Desktop desktop(){
//        return new Desktop();
//    }
//
//    @Bean(name = "lap1")
//    @Primary
//    public Laptop laptop(){
//        return new Laptop();
//    }

}
