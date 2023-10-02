package com.tekwillacademy.zooclubservice;

public class ZooService {
    public static void main(String[] args) {
        Animal dog1 = new Dog("Jessica");
        dog1.eat();
        Cat cat = new Cat("Sonic");
        cat.makeSound();
        cat.eat();
    }
}
