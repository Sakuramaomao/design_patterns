package com.lzj.creational.singleton.lazy;

import org.junit.Test;

import static org.junit.Assert.*;

public class StaticInnerClassSingletonTest {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new T2());
        Thread thread2 = new Thread(new T2());
        thread1.start();
        thread2.start();
        System.out.println("run end!");
    }
}