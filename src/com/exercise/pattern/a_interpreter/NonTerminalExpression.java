package com.exercise.pattern.a_interpreter;

import java.util.Map;

public class NonTerminalExpression extends Expression{
    public NonTerminalExpression(Expression... expressions) {

    }
    @Override
    public Object interpreter(Map ctx) {
        return null;
    }
}
