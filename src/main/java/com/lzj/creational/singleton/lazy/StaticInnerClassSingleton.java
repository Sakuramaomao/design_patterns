package com.lzj.creational.singleton.lazy;

/**
 * 功能：基于类初始化的延迟加载解决方案。
 * 风格：单例模式-静态内部类。
 *
 * @Author Sakura
 * @Date 2019/3/17 15:36
 */
public class StaticInnerClassSingleton {
    private StaticInnerClassSingleton() {}

    /* 类级别的内部类（相当于外部类中的一个静态属性了，可以直接被调用）。
    * 其实这种方式利用了静态属性在内存中的唯一性。
    * 并且只有getInstance方法被调用的时候，内部类InnerClass才会被创建，
    * 静态变量instance被创建出来，形似懒汉式单例。
    * */
    private static class InnerClass {
        private static StaticInnerClassSingleton instance = new StaticInnerClassSingleton();
    }

    // 获取单例对象。
    public static StaticInnerClassSingleton getInstance() {
        return InnerClass.instance;
    }
}
