package com.lzj.structural.adapter.objectadapter;

/**
 * 对象适配器模式。
 *
 * @Author Sakura
 * @Date 2019/4/11 7:42
 */
public class Adapter implements Target {
    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        // 使用被适配者的方法。并且在执行被适配者方法之前
        // 和之后都可以增加其他的代码。
        // ...
        adaptee.adapteeRequest();
        // ...
    }
}
