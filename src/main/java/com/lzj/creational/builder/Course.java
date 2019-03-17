package com.lzj.creational.builder;

/**
 * 功能：课程实体类
 * 风格：在Course类内部使用静态内部类的方式添加一个Course的构造者。
 *      使之可以使用链式调用的方式完成Course的建造。
 *
 * @Author Sakura
 * @Date 2019/3/17 10:55
 */
public class Course {
    private String courseName;
    private String courseVideo;
    private String courseArticle;

    public Course(CourseBuilder courseBuilder) {
        this.courseName = courseBuilder.courseName;
        this.courseVideo = courseBuilder.courseVideo;
        this.courseArticle = courseBuilder.courseArticle;
    }

    /**
     * Course的建造者。
     */
    public static class CourseBuilder {
        private String courseName;
        private String courseVideo;
        private String courseArticle;

        public CourseBuilder buildCourseName(String courseName) {
            this.courseName = courseName;
            return this;
        }

        public CourseBuilder buildCourseVide(String courseVideo) {
            this.courseVideo = courseVideo;
            return this;
        }

        public CourseBuilder buildCourseArticle(String courseArticle) {
            this.courseArticle = courseArticle;
            return this;
        }

        public Course build() {
            return new Course(this);
        }

    }


    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseVideo() {
        return courseVideo;
    }

    public void setCourseVideo(String courseVideo) {
        this.courseVideo = courseVideo;
    }

    public String getCourseArticle() {
        return courseArticle;
    }

    public void setCourseArticle(String courseArticle) {
        this.courseArticle = courseArticle;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", courseVideo='" + courseVideo + '\'' +
                ", courseArticle='" + courseArticle + '\'' +
                '}';
    }
}
