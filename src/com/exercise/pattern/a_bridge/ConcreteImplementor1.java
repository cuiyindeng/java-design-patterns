package com.exercise.pattern.a_bridge;

public class ConcreteImplementor1 implements Implementor{
    @Override
    public void doSomething() {
        System.out.println("常规方法");
    }

    @Override
    public void doAnything() {
        System.out.println("修正方法");
    }
}
