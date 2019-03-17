package com.lzj.creational.singleton.hungry;

import java.io.Serializable;

/**
 * 功能：饿汉式的单例模式。
 * 注意：饿汉式的实现是单例中很简单的一种，在类加载的时候就会
 *      建立对象。如果不考虑占用内存的话，可以使用，并且这种
 *      方式不存在多线程访问的安全性问题。
 *
 * @Author Sakura
 * @Date 2019/3/17 16:07
 */
public class HungrySingleton implements Serializable {
    // 定义为final，不准许变量被二次赋值。
    private final static HungrySingleton hungrySingleton;

    // 使用静态代码块，或者直接给hungrySingleton变量赋值new出的对象，都可以的。
    static {
        hungrySingleton = new HungrySingleton();
    }

    private HungrySingleton() {
        // 防止反射攻击。
        if (hungrySingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

    public Object readResolve() {
        return hungrySingleton;
    }
}
