package com.lzj.creational.abstractfactory;

/**
 * @Author Sakura
 * @Date 2019/3/16 17:54
 */
public class JavaVideo implements Video {
    @Override
    public void produce() {
        System.out.println("生产了Java视频。");;
    }
}
