package com.lzj.creational.singleton.lazy;

/**
 * 模拟多线程访问没有进行线程安全处理的懒汉式单例模式可能会出现的问题。
 * 并且练习多线程DEBUG方式。
 *
 * @Author Sakura
 * @Date 2019/3/17 12:30
 */
public class T2 implements Runnable {
    @Override
    public void run() {
        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ": " + instance);
    }
}
