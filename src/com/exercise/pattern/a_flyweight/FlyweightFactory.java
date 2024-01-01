package com.exercise.pattern.a_flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    public static Map<String, Flyweight> pool = new HashMap<>();

    public static Flyweight getFlyweight(String extrinsic) {
        Flyweight flyweight = null;
        if (pool.containsKey(extrinsic)) {
            flyweight = pool.get(extrinsic);
        } else {
            if ("Flyweight1".equals(extrinsic)) {
                flyweight = new ConcreteFlyweight1(extrinsic);
            }
            if ("Flyweight2".equals(extrinsic)) {
                flyweight = new ConcreteFlyweight2(extrinsic);
            }
            pool.put(extrinsic, flyweight);
        }
        return flyweight;
    }
}
