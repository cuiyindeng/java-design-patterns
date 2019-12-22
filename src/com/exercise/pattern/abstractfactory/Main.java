package com.exercise.pattern.abstractfactory;

public class Main {
    /**
     *
     *
     *
     * @param args
     */
    public static void main(String[] args) {
        AbstractCreator creator1 = new Creator1();
        AbstractCreator creator2 = new Creator2();

        AbstractProductA productA1 = creator1.createProductA();

        //....

        AbstractProductB productB2 = creator2.createProductB();

    }
}
