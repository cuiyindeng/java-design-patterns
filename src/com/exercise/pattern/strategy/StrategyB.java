package com.exercise.pattern.strategy;

public class StrategyB implements Strategy {
    @Override
    public void useStrategy() {
        System.out.println("StrategyB.useStrategy");
    }
}
