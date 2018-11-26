package com.exercise.pattern.simplefactory;

public class Farmer {
    public static Fruit getFruit(String fruit) {
        if ("apple".equals(fruit)) {
            return new Apple();
        } else if ("pear".equals(fruit)) {
            return new Pear();
        } else {
            return null;
        }
    }
}
