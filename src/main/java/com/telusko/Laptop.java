package com.telusko;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
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
