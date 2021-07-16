package com.spon.learning;

import com.spon.learning.declarationsandmodifiers.ParentChildObjectTest;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        ParentChildObjectTest pcObjectTest = new ParentChildObjectTest();
        System.out.println(pcObjectTest.hashCode());
    }
}
