package com.lzj.creational.singleton.hungry;

import org.junit.Test;

import java.io.*;

import static org.junit.Assert.*;

public class HungrySingletonTest {

    /**
     * 测试：使用序列化来破坏单例。
     */
    @Test
    public void getInstance() throws IOException, ClassNotFoundException {
        HungrySingleton instance = HungrySingleton.getInstance();

        // 开始对单例对象的序列化
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\instance"));
        oos.writeObject(instance);

        // 反序列化
        FileInputStream fis = new FileInputStream("D:\\instance");
        ObjectInputStream ois = new ObjectInputStream(fis);
        HungrySingleton newInstance = (HungrySingleton) ois.readObject();

        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);
    }
}