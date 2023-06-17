package com.exercise.pattern.templatemethod;

public class ConcreteClass1 extends AbstractClass {
    @Override
    protected void doSomething() {
        System.out.println("模板类1的doSomething");
    }

    @Override
    protected void doAnything() {
        System.out.println("模板类1的doAnything");
    }
}
