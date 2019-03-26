package com.lzj.creational.singleton.enumsingleton;

/**
 * 功能：使用枚举类实现单例模式。
 * 注意：这种方式实现的单例可以有效方式序列化、反射的攻击，
 *      并且也不存在线程安全的问题。
 *
 * @Author Sakura
 * @Date 2019/3/17 17:38
 */
public class EnumInstance {
    // 私有构造函数。
    private EnumInstance() {}

    // 枚举的方式实现单例模式。
    private enum Singleton {
        INSTANCE;

        private final EnumInstance instance;

        private Singleton() {
            instance = new EnumInstance();
        }

        public EnumInstance getInstance() {
            return instance;
        }
    }

    // 对外提供获取单例的方法。
    public static EnumInstance getInstance() {
        return Singleton.INSTANCE.getInstance();
    }
}
