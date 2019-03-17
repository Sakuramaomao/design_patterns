package com.lzj.creational.singleton.enumsingleton;

import org.junit.Test;

public class EnumInstanceTest {
    @Test
    public void enumSingletonTest() {
        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();
        System.out.println("run end");
    }
}