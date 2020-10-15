package com.company;

public class Dog extends Animal {
    private String color;
    private int age;
    public Dog(String name, int legs, String color, int age) {
        this.color = color;
        this.setName(name);
        this.legs = legs;
        this.age = age;
    }
    public void makeSound() {
        System.out.println("Gav!");
    }

}
