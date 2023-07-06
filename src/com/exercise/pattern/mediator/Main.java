package com.exercise.pattern.mediator;

public class Main {

    /**
     * 中介者模式的目的是用一个中介对象封装一系列的对象交互，中介者使对象之间不需要显示的交互作用，从而降低了对象的耦合度，而且可以独立的改变他们之间的交互。
     * @param args
     */
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        ConcreteColleague1 concreteColleague1 = new ConcreteColleague1(mediator);
        ConcreteColleague2 concreteColleague2 = new ConcreteColleague2(mediator);

        mediator.setConcreteColleague1(concreteColleague1);
        mediator.setConcreteColleague2(concreteColleague2);

        concreteColleague1.depMethod1();
        concreteColleague2.depMethod2();
    }
}
