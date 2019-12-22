package com.exercise.pattern.factory;

public class Main {
    public static void main(String[] args) {
        ConcreteCreator creator = new ConcreteCreator();
        ConcreteProduct1 product = creator.createProduct(ConcreteProduct1.class);
        product.method2();
    }
}
