package com.lzj.creational.singleton.enumsingleton;

/**
 * 功能：使用枚举类实现单例模式。
 * 注意：这种方式实现的单例可以有效方式序列化、反射的攻击，
 *      并且也不存在线程安全的问题。
 *
 * @Author Sakura
 * @Date 2019/3/17 17:38
 */
public enum EnumInstance {
    INSTANCE;
    // data是个单例。
    private static Object data = new Object();

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumInstance getInstance() {
        return INSTANCE;
    }
}
