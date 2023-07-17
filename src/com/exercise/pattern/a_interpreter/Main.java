package com.exercise.pattern.a_interpreter;

import java.util.HashMap;
import java.util.Stack;

public class Main {
    /**
     *解释器模式可以实现：给定一门语言，定义它的语法的表示，并定义一种解释器，该解释器可以用该表示来解释语言中的句子。
     * @param args
     */
    public static void main(String[] args) {
        HashMap<Object, Object> ctx = new HashMap<>();
        Stack<Expression> stack = null;
        for (int i = 0; i < 10; i++) {

        }
        Expression expression = stack.pop();
        expression.interpreter(ctx);
    }
}
