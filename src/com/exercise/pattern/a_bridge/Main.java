package com.exercise.pattern.a_bridge;

public class Main {
    /**
     * 桥梁模式的目的是将抽象和实现解耦，使得两者可以独立的变化。
     * @param args
     */
    public static void main(String[] args) {
        ConcreteImplementor1 concreteImplementor1 = new ConcreteImplementor1();
        RefinedAbstraction abstraction = new RefinedAbstraction(concreteImplementor1);
        abstraction.request();

    }
}
