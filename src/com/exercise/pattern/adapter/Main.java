package com.exercise.pattern.adapter;

public class Main {
    /**
     *适配器模式把一个类的接口变换成客户端所期待的另一种接口，从而使原本因接口不匹配而无法在一起工作的两个类能够在一起工作。
     */
    public static void main(String[] args) {
        ClassAdapter adapter1 = new ClassAdapter();
        adapter1.sampleOperation1();
        ObjectAdapter adapter2 = new ObjectAdapter(new Adaptee());
        adapter2.sampleOperation1();
    }
}
