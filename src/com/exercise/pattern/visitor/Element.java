package com.exercise.pattern.visitor;

public abstract class Element {
    public abstract void doSomething();
    public abstract void accept(IVisitor visitor);

}
