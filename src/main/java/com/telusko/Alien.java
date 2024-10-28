package com.telusko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;
@Component
//@Scope("prototype")
public class Alien {
  @Value("21")
   private int age;
//   Field injection
   @Autowired
   @Qualifier("desktop")
   private Compuetr com;

    public Alien(){
        System.out.println("Object created");
    }

    public Alien(int age){
        System.out.println("constructor injection");
        this.age = age;
    }
//@ConstructorProperties({"age" ,"lap"})
//    public Alien(int age, Laptop lap){
//        this.age = age;
//        this.lap = lap;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
//        System.out.println("setter called");
        this.age = age;
    }

    public Compuetr getCom() {
        return com;
    }

    public void setCom(Compuetr com) {
        this.com = com;
    }

    public void code(){
        System.out.println("coding");
        com.compile();
    }
}
