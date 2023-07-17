package com.exercise.pattern.composite;

public class Main {
    /**
     * 组合模式可以将对象组合成树形结构，以表示”部分-整体“的层次结构，这样可以让用户对单个对象和组合对象的操作具有一致性。
     * @param args
     */
    public static void main(String[] args) {
        Composite root = new Composite();
        root.doSomething();
        System.out.println("------------------");
        Composite branch = new Composite();
        Leaf leaf = new Leaf();
        root.add(branch);
        branch.add(leaf);

        display(root);
    }

    public static void display(Composite root) {
        for (Component component : root.getChildren()) {
            if (component instanceof Leaf) {
                component.doSomething();
            } else {
                display((Composite) component);
            }
        }
    }
}
