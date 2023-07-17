package com.exercise.pattern.iterator;

import java.util.Vector;

public class ConcreteIterator implements Iterator{
    private Vector vector;
    private int cursor = 0;

    public ConcreteIterator(Vector vector) {
        this.vector = vector;
    }

    public Object next() {
        Object object = null;
        if (hasNext()) {
            object = this.vector.get(cursor++);
        }
        return object;
    }

    public boolean hasNext() {
        return this.cursor != this.vector.size();
    }

    public boolean remove() {
        this.vector.remove(this.cursor);
        return true;
    }
}
