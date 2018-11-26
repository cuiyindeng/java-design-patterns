package com.exercise.pattern.strategy;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void invokeStrategy() {
        strategy.useStrategy();
    }
}
