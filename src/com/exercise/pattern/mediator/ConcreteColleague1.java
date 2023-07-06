package com.exercise.pattern.mediator;

public class ConcreteColleague1 extends Colleague{

    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    public void selfMethod1() {

    }

    public void depMethod1() {
        super.mediator.doSomething1();
    }
}
