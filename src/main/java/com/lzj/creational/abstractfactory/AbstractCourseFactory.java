package com.lzj.creational.abstractfactory;

/**
 * 功能：课程的抽象工厂类。
 *      这个工厂生产的是某个课程（产品族）中包含多个内容（产品等级）的东西。
 * 风格：抽象工厂模式。
 * 注意：抽象工厂模式针对的是一定程度上固定不变的产品族。
 *
 * @Author Sakura
 * @Date 2019/3/16 17:35
 */
public interface AbstractCourseFactory {
    /**
     * 获取课程（产品族）的抽象方法。
     * 课程包含视频内容。
     *
     * @return 课程（产品族）。
     */
    Video getVideo();
    /**
     * 获取课程（产品族）的抽象方法。
     * 课程包含笔记内容。
     *
     * @return 课程（产品族）。
     */
    Article getArticle();
}
