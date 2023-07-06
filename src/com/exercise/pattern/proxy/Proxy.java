package com.exercise.pattern.proxy;


public class Proxy implements Subject{
    private Subject subject;
    public Proxy() {
        this.subject = new RealSubject();
    }
    public Proxy(Subject subject) {
        this.subject = subject;
    }
    @Override
    public void request() {
        this.before();
        this.subject.request();
        this.after();
    }

    private void before() {

    }

    private void after() {

    }
}
