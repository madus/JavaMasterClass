package com.challenge;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Animal animal = new Animal("Animal",1,1,5,5);
        Dog dog = new Dog("Yorkie",8,20,2,4,1,20,"lonf silky");
        dog.eat();
        dog.walk();
        dog.run();
        dog.move(12);

    }
}
