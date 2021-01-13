package com.company;

public class Main {

    public static void main(String[] args) {
	    Object dog1 = new Dog();
	    if (dog1 instanceof Dog) {
            Dog dog11 = (Dog) dog1;
            dog11.eat();
        }
    }
}
