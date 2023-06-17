package com.exercise.pattern.templatemethod;

public class Main {
    public static void main(String[] args) {
        AbstractClass concreteClass1 = new ConcreteClass1();
        AbstractClass concreteClass2 = new ConcreteClass2();
        concreteClass1.templateMethod();
        concreteClass2.templateMethod();
    }
}
