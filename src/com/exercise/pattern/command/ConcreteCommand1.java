package com.exercise.pattern.command;

public class ConcreteCommand1 extends Command{
    private Receiver receiver;

    public ConcreteCommand1(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.doSomething();
    }
}
