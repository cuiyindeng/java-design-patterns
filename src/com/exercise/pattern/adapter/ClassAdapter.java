package com.exercise.pattern.adapter;

public class ClassAdapter extends Adaptee implements Target {
    @Override
    public void sampleOperation2() {
        System.out.println("sampleOperation2");
    }
}
