package com.lzj.creational.singleton.enumsingleton;

/**
 * 枚举类型单例模式的多线程测试。
 *
 * @Author Sakura
 * @Date 2019/3/17 12:30
 */
public class T implements Runnable {
    @Override
    public void run() {
        Object instance = EnumInstance.getInstance();
        System.out.println(Thread.currentThread().getName() + ": " + instance);
    }
}
