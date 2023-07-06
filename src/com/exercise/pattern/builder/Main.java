package com.exercise.pattern.builder;

public class Main {

    /**
     *建造者模式的目的是将对象的构建和表示分离，使得相同的构建可以创建不同的表示
     * @param args
     */
    public static void main(String[] args) {
        Director director = new Director();
        Product aProduct = director.getAProduct();
        aProduct.doSomething();

    }
}
