package com.telusko;

public class Desktop implements Compuetr{

   public Desktop(){
       System.out.println("Desktop object created");
   }
    @Override
    public void compile() {
        System.out.println("desktop");
    }
}
