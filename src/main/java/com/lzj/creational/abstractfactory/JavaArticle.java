package com.lzj.creational.abstractfactory;

/**
 * @Author Sakura
 * @Date 2019/3/16 17:56
 */
public class JavaArticle implements Article {
    @Override
    public void produce() {
        System.out.println("生产了Java笔记。");;
    }
}
