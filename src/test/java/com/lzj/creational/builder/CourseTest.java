package com.lzj.creational.builder;

import org.junit.Test;

public class CourseTest {
    @Test
    public void getCourse() {
        Course course = new Course.CourseBuilder()
                .buildCourseName("Java设计模式精讲")
                .buildCourseVide("Java视频")
                .build();
        System.out.println(course);
    }

}