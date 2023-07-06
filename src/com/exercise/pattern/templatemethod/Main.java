package com.exercise.pattern.templatemethod;

public class Main {
    /**
     * 模板方法的目的是定义一个操作中的算法的框架，并将算法的步骤延迟到子类中，这样就可以让子类不改变算法的结构就可以重新定义算法的某些步骤。
     * @param args
     */
    public static void main(String[] args) {
        AbstractClass concreteClass1 = new ConcreteClass1();
        AbstractClass concreteClass2 = new ConcreteClass2();
        concreteClass1.templateMethod();
        concreteClass2.templateMethod();
    }
}
