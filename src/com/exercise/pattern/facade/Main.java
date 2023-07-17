package com.exercise.pattern.facade;

public class Main {
    /**
     * 门面模式的目的是让子系统的外部与其内部进行通信时，必须通过一个统一的对象进行。门面模式提供了一个高层次的接口，使得子系统更容易使用。
     * @param args
     */
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.methodA();
        facade.methodB();
        facade.methodC();
    }
}
