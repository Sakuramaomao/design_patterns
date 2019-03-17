package com.lzj.creational.abstractfactory;

import org.junit.Test;

public class VideoTest {
    @Test
    public void produce() {
        AbstractCourseFactory courseFactory = new PythonCourseFactory();
        // 这里获取的video和article一定是Java的，而不会与Python的混淆。
        Video video = courseFactory.getVideo();
        Article article = courseFactory.getArticle();
        video.produce();
        article.produce();
    }

}