package com.exercise.pattern.state;

public class Main {
    /**
     * 状态模式可以实现：当一个对象改变它的内在状态时允许它改变行为，这个对象看起来像改变了它的类。
     * @param args
     */
    public static void main(String[] args) {
        Context context = new Context();
        context.setCurrentState(new ConcreteState1());
        context.handle1();
        context.handle2();
        context.handle1();
    }
}
