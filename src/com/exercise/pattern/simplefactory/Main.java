package com.exercise.pattern.simplefactory;

public class Main {
    /**
     *简单工厂模式或者说工厂模式的关注点并不在于在工厂中是如何生产出来需要的类的，而在于将创建产品与消费产品分离。
     */
    public static void main(String[] args) {
        Fruit apple = Farmer.getFruit("apple");
        apple.grow();
        Fruit pear = Farmer.getFruit("pear");
        pear.grow();
    }
}
