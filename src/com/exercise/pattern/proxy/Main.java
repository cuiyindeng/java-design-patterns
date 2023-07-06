package com.exercise.pattern.proxy;

public class Main {
    /**
     * 代理模式可以为其他对象提供一个代理用来控制对这个对象的访问
     * @param args
     */
    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        Proxy proxy = new Proxy(realSubject);
        proxy.request();
    }
}
