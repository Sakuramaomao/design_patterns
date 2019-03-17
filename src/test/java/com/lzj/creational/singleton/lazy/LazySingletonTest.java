package com.lzj.creational.singleton.lazy;

import org.junit.Test;

import static org.junit.Assert.*;

public class LazySingletonTest {

    @Test
    public void getInstance() {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        System.out.println(lazySingleton);
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new T());
        Thread thread2 = new Thread(new T());
        thread1.start();
        thread2.start();
        System.out.println("run end!");
    }
}