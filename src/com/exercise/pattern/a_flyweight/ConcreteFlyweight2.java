package com.exercise.pattern.a_flyweight;

public class ConcreteFlyweight2 extends Flyweight{

    public ConcreteFlyweight2(String extrinsic) {
        super(extrinsic);
    }

    @Override
    public void operate() {
        setIntrinsic("这是享元对象2");
        System.out.println(getIntrinsic() + "在处理逻辑");
    }
}
