package com.exercise.pattern.strategy;

public class Main {

    /**
     *策略模式通常是把一系列的算法包装到一系列的策略类里面，作为一个抽象策略类的子类。
     * 只需要在上下文中引用一个抽象策略接口，来使用策略。
     */
    public static void main(String[] args) {
        Context context = new Context(new StrategyA());
        context.invokeStrategy();
        context = new Context(new StrategyB());
        context.invokeStrategy();
    }
}
