package com.exercise.pattern.chainofresponsibility;

public class Main {
    /**
     * 责任链模式的目的是让多个对象都有机会处理请求，避免了请求的接收方和发送方之间的耦合关系。将这些对象组合成一条链，并沿着这条链传递请求，直到有对象处理它为止。
     * @param args
     */
    public static void main(String[] args) {
        ConcreteHandler1 concreteHandler1 = new ConcreteHandler1();
        ConcreteHandler2 concreteHandler2 = new ConcreteHandler2();
        ConcreteHandler3 concreteHandler3 = new ConcreteHandler3();

        concreteHandler1.setNextHandler(concreteHandler2);
        concreteHandler2.setNextHandler(concreteHandler3);

        Response response = concreteHandler1.handleMessage(new Request());

    }
}
