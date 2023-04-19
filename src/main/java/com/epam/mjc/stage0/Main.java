package com.epam.mjc.stage0;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        String description = dog.getDescription();
        System.out.println(description);

        Animal bird = new Bird();
        String description1 = bird.getDescription();
        System.out.println(description1);
    }
}
