package com.exercise.pattern.chainofresponsibility;

public class ConcreteHandler1 extends Handler{
    @Override
    protected Level getHandleLevel() {
        return null;
    }

    @Override
    protected Response echo(Request request) {
        return null;
    }
}
