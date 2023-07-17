package com.exercise.pattern.command;

public class Main {
    /**
     * 命令模式可以将请求封装成一个对象，从而可以使用不同的请求把客户端参数化、对请求排队和记录请求日志、提供命令的撤销和恢复操作。
     * @param args
     */
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        ConcreteReceiver1 receiver1 = new ConcreteReceiver1();
        ConcreteCommand1 command1 = new ConcreteCommand1(receiver1);

        invoker.setCommand(command1);
        invoker.action();
    }
}
