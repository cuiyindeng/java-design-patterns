package com.exercise.pattern.builder;

public class ConcreteProduct extends Builder{
    private Product product =  new Product();
    @Override
    public void setPart() {
        product.doSomething();
    }

    @Override
    public Product buildProduct() {
        return product;
    }
}
