package com.exercise.pattern.iterator;

public class Main {
    /**
     * 迭代器模式的目的是提供一种方法访问容器对象中的各个元素，并且不需要暴露容器对象的内部细节
     * @param args
     */
    public static void main(String[] args) {
        ConcreteAggregate concreteAggregate = new ConcreteAggregate();
        concreteAggregate.add("aaa");
        concreteAggregate.add("bbb");
        concreteAggregate.add("ccc");
        Iterator iterator = concreteAggregate.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
