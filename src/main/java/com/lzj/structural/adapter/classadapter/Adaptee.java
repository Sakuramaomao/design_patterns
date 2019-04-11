package com.lzj.structural.adapter.classadapter;

/**
 * 被适配者，有一个独有的方法。
 *
 * @Author Sakura
 * @Date 2019/4/11 7:40
 */
public class Adaptee {
    protected void adapteeRequest() {
        System.out.println("使用被适配者的request方法。");
    }
}
