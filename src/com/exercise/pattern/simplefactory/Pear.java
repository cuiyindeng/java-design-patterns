package com.exercise.pattern.simplefactory;

public class Pear implements Fruit {
    @Override
    public void plant() {
        System.out.println("Pear.plant");
    }

    @Override
    public void grow() {
        System.out.println("Pear.grow");
    }

    @Override
    public void harvest() {
        System.out.println("Pear.harvest");
    }
}
