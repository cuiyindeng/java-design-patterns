package com.exercise.pattern.a_flyweight;

public class Main {
    /**
     * 享元模式的目的是通过共享来有效的支持大量细粒度的对象
     * @param args
     */
    public static void main(String[] args) {
        Flyweight flyweight1 = FlyweightFactory.getFlyweight("Flyweight1");
        Flyweight flyweight2 = FlyweightFactory.getFlyweight("Flyweight2");

        flyweight1.operate();
        flyweight2.operate();

        System.out.println("第一次创建之后，对象一共有：" + FlyweightFactory.pool.size());

        Flyweight flyweight3 = FlyweightFactory.getFlyweight("Flyweight1");
        flyweight3.operate();

        System.out.println("第二次创建之后，对象一共有：" + FlyweightFactory.pool.size());
    }
}
