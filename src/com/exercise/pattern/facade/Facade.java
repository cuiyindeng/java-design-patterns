package com.exercise.pattern.facade;

public class Facade {
    private SystemA systemA = new SystemA();
    private SystemB systemB = new SystemB();
    private SystemC systemC = new SystemC();

    public void methodA() {
        systemA.doSomethingA();
    }
    public void methodB() {
        systemB.doSomethingB();
    }public void methodC() {
        systemC.doSomethingC();
    }
}
