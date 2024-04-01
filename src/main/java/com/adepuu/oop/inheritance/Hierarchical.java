package com.adepuu.oop.inheritance;

class Cat extends com.adepuu.oop.inheritance.Animal {
    void purr() {
        System.out.println("purr");
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        Cat cat  = new Cat();
        cat.purr();
        cat.eat();

        com.adepuu.oop.inheritance.Dog dog = new com.adepuu.oop.inheritance.Dog();
        dog.bark();
        dog.eat();
    }
}
