package com.lzj.structural.composite;

/**
 * 课程类，是课程目录类的叶子节点。
 * 它们都继承了相同的抽象类。
 *
 * @Author Sakura
 * @Date 2019/4/13 19:05
 */
public class Course extends CatalogComponent {
    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    @Override
    protected void print() {
        System.out.println("课程名称为 -- " + courseName);
    }
}
