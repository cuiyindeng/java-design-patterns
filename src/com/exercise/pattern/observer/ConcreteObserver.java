package com.exercise.pattern.observer;

public class ConcreteObserver implements Observer{
    @Override
    public void update() {
        System.out.println("观察者接收到消息");
    }
}
