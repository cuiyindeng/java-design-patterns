package com.exercise.pattern.adapter;

public class ObjectAdapter {
    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }
    /*
    sampleOperation1委托给Adaptee
     */
    public void sampleOperation1() {
        adaptee.sampleOperation1();
    }

    /*
    sampleOperation2由Adapter自己实现
     */
    public void sampleOperation2() {
        System.out.println("sampleOperation2");
    }
}
