package com.company;

public class Main {

    public static void main(String[] args) {

        Animal fish = new Animal();
        fish.setLegs(0);
        fish.setName("Shark");
        System.out.println(fish.getName());
        System.out.println(fish.getLegs());

        Dog sharik = new Dog("Sharik",4,"white",10);
        sharik.makeSound();
        //sharik.setName("Sharik");
        //sharik.setLegs(4);
        //sharik.getLegs();
        //sharik.getName();

    }
}
