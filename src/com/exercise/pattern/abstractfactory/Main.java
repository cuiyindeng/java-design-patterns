package com.exercise.pattern.abstractfactory;

public class Main {
    /**
     *抽象工厂可以创建多个产品家族，一个产品家族就是不同特性的产品的组合；因为有多个产品家族，所以就需要有多个产品工厂。
     *
     * @param args
     */
    public static void main(String[] args) {
        AbstractCreator creator1 = new Creator1();
        AbstractCreator creator2 = new Creator2();

        AbstractProductA productA1 = creator1.createProductA();

        //....

        AbstractProductB productB2 = creator2.createProductB();

    }
}
