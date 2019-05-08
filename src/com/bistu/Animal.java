package com.bistu;

public class Animal implements Talking {
    //封装，继承
    private String name;
    private int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public void say() {
        System.out.println(name+" Animal say");
    }
}
