package com.exercise.pattern.strategy;

public class StrategyA implements Strategy {
    @Override
    public void useStrategy() {
        System.out.println("StrategyA.useStrategy");
    }
}
