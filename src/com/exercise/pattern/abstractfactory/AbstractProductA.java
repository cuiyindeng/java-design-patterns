package com.exercise.pattern.abstractfactory;

public abstract class AbstractProductA {
    public void shareMethod() {
        System.out.println("产品共有的方法");
    }

    public abstract void doSomething();
}
