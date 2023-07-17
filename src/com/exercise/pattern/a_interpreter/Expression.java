package com.exercise.pattern.a_interpreter;

import java.util.Map;

public abstract class Expression {
    public abstract Object interpreter(Map ctx);
}
