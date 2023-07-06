package com.exercise.pattern.prototype;

public class Main {

    /**
     * 原型模式可以用原型类的实例创建不同种类的对象，并且是通过拷贝原型创建了新的对象。
     * @param args
     */
    public static void main(String[] args) {
        PrototypeClass prototypeClass = new PrototypeClass();
        PrototypeClass prototypeClass1 = prototypeClass.clone();
        System.out.println(prototypeClass);
        System.out.println(prototypeClass1);
    }
}
