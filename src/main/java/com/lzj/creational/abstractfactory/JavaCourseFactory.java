package com.lzj.creational.abstractfactory;

/**
 * @Author Sakura
 * @Date 2019/3/16 17:46
 */
public class JavaCourseFactory implements AbstractCourseFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
