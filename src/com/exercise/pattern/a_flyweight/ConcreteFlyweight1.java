package com.exercise.pattern.a_flyweight;

public class ConcreteFlyweight1 extends Flyweight{

    public ConcreteFlyweight1(String extrinsic) {
        super(extrinsic);
    }

    @Override
    public void operate() {
        setIntrinsic("这是享元对象1");
        System.out.println(getIntrinsic() + "在处理逻辑");
    }
}
