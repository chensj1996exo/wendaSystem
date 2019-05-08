package com.bistu;

public class Human extends Animal {

    private String country;

    public Human(String name, int age, String country){
        super(name, age);
        this.country = country;
    }
    @Override
    public void say() {
        //多态，重写父类中的方法
        System.out.println("This is a people from " + country);
    }
}
