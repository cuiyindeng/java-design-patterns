package com.exercise.pattern.memento;

public class Main {
    /**
     * 备忘录模式的目的是在不破坏封装性的前提下，捕获到对象内部的状态，并在对象外部保存保存这个状态。这样就可以将该对象恢复到原先保存的状态。
     * @param args
     */
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("1");
        System.out.println(originator.getState());
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());
        originator.setState("2");
        System.out.println(originator.getState());
        originator.restoreMemento(caretaker.getMemento());
        System.out.println(originator.getState());
    }
}
