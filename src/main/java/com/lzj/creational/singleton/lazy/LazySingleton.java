package com.lzj.creational.singleton.lazy;

/**
 * 功能；单例模式。
 * 风格：懒汉式。
 * 注意：单线程，存在多线程访问时的安全隐患。
 *
 * @Author Sakura
 * @Date 2019/3/17 12:25
 */
public class LazySingleton {

    // 私有构造器
    private LazySingleton() { }

    /**
     * V1、提供获取lazySingleton的单线程方法。
     */
    //private static LazySingleton lazySingleton = null;
    //public static LazySingleton getInstance() {
    //    if (lazySingleton == null) {
    //        lazySingleton = new LazySingleton();
    //    }
    //    return lazySingleton;
    //}

    /**
     * V2、提供获取lazySingleton的同步方法。这里锁的是整个类，性能消耗比较大。
     */
    //private static LazySingleton lazySingleton = null;
    //public synchronized static LazySingleton getInstance() {
    //    if (lazySingleton == null) {
    //        lazySingleton = new LazySingleton();
    //    }
    //    return lazySingleton;
    //}

    /**
     * V3、使用Double Check方式解决性能问题，并且使用volatile关键字避免重排序问题。
     */
    private volatile static LazySingleton lazySingleton = null;
    public static LazySingleton getInstance() {
        /* 如果lazySingleton不加有volatile关键字，
           那么有可能会因为重排序问题获取到未建立完全的LazySingleton对象。*/
        if (lazySingleton == null) {
            synchronized (LazySingleton.class) {
                if (lazySingleton == null) {
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }
}
