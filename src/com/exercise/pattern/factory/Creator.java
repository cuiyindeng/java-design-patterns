package com.exercise.pattern.factory;

public abstract class Creator {

    /**
     * 创建一个产品对象，参数通常为String、Enum、Class等，也可以为空。
     * @param c
     * @param <T>
     * @return
     */
    public abstract <T extends Product> T createProduct(Class<T> c);
}
