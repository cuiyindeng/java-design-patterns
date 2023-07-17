package com.exercise.pattern.a_flyweight;

public abstract class Flyweight {
    private String intrinsic;
    protected final String extrinsic;

    public Flyweight(String extrinsic) {
        this.extrinsic = extrinsic;
    }

    public abstract void operate();

    public void setIntrinsic(String intrinsic) {
        this.intrinsic = intrinsic;
    }

    public String getIntrinsic() {
        return intrinsic;
    }
}
