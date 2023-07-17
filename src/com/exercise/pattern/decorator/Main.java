package com.exercise.pattern.decorator;

public class Main {
    /**
     * 装饰器模式的目的是利用运行时的组合操作，动态地给对象添加一些额外的功能，比直接用子类更加灵活。
     * @param args
     */
    public static void main(String[] args) {
        Component concreteComponent = new ConcreteComponent();
        concreteComponent = new ConcreteDecorator1(concreteComponent);
        concreteComponent = new ConcreteDecorator2(concreteComponent);

        concreteComponent.operate();
    }
}
