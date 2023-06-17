package com.exercise.pattern.factory;

public class Main {
    /**
     * 工厂方法可以创建具有共性的产品，需要有一个定义产品共性的抽象产品类，还需要一个创建产品的抽象工厂类，具体的产品创建可以由具体的工厂类去实现。
     * @param args
     */
    public static void main(String[] args) {
        ConcreteCreator creator = new ConcreteCreator();
        ConcreteProduct1 product = creator.createProduct(ConcreteProduct1.class);
        product.method2();
    }
}
