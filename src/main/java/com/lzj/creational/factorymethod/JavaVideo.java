package com.lzj.creational.factorymethod;

/**
 * @Author Sakura
 * @Date 2019/3/16 11:16
 */
public class JavaVideo extends Video {
    @Override
    void produce() {
        System.out.println("生产了Java视频。");
    }
}
