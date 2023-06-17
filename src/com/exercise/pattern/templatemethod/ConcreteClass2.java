package com.exercise.pattern.templatemethod;

public class ConcreteClass2 extends AbstractClass {
    @Override
    protected void doSomething() {
        System.out.println("模板类2的doSomething");
    }

    @Override
    protected void doAnything() {
        System.out.println("模板类2的doAnything");
    }
}
