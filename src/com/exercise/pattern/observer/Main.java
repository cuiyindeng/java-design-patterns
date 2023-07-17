package com.exercise.pattern.observer;

public class Main {
    /**
     * 观察者模式可以在对象间建立一种一对多的关系，使得当一个对象的状态改变时，其他依赖此对象的对象都能得到通知并自动更新。
     * @param args
     */
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        ConcreteObserver observer = new ConcreteObserver();
        subject.addObserver(observer);
        subject.doSomething();
    }
}
