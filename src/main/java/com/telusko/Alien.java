package com.telusko;

import java.beans.ConstructorProperties;

public class Alien {
   private int age;
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
