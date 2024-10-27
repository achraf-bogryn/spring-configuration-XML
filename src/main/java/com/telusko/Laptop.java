package com.telusko;

public class Laptop implements Compuetr {
    @Override
    public void compile() {
        System.out.println("laptop");
    }
    public Laptop(){
        System.out.println("Laptop Object Constructor");
    }
//    public void compile(){
//        System.out.println("compiling Laptop");
//    }

}
