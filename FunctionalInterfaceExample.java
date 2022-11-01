package com.practice.demo;

@FunctionalInterface  
interface sayable{  
    void say(String name);  
}  
public class FunctionalInterfaceExample implements sayable{  
    public void say(String name){  
        System.out.println(name);  
    }  
    public static void main(String[] args) {  
        FunctionalInterfaceExample fie = new FunctionalInterfaceExample();  
        fie.say("Anupama");  
    }  
}  