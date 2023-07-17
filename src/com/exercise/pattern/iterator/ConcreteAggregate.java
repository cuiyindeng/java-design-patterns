package com.exercise.pattern.iterator;

import java.util.Vector;

public class ConcreteAggregate implements Aggregate{
    private Vector vector = new Vector();
    public void add(Object object) {
        this.vector.add(object);
    }

    public void remove(Object object) {
        this.remove(object);
    }

    public Iterator iterator() {
        return new ConcreteIterator(this.vector);
    }
}
