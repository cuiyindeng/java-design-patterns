package com.exercise.pattern.visitor;

public class Main {
    /**
     * 访问者模式可以封装一些用于某些数据结构中的元素的操作，它可以在不改变数据结构的前提下定义作用于这些元素的新的操作。
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Element element = ObjectStructure.createElement();
            element.accept(new Visitor());
        }
    }
}
