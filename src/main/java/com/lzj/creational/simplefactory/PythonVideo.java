package com.lzj.creational.simplefactory;

/**
 * @Author Sakura
 * @Date 2019/3/16 11:17
 */
public class PythonVideo extends Video {
    @Override
    void produce() {
        System.out.println("生产了Python视频。");
    }
}
