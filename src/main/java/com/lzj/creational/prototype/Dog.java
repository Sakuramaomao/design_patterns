package com.lzj.creational.prototype;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author Sakura
 * @Date 2019/4/8 22:02
 */
public class Dog implements Cloneable {
    private String name;

    private List<Date> days = new ArrayList<>();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // 先进行一次浅拷贝。
        Dog dog = (Dog) super.clone();
         /*直接将待拷贝的list集合放入新new的List集合中，
         这个构造方法会执行元素的copy方法，实现深度拷贝。*/
        dog.days = new ArrayList<>(this.days);
        return dog;
    }

    public Dog(String name, List<Date> days) {
        this.name = name;
        this.days = days;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Date> getDays() {
        return days;
    }

    public void setDays(List<Date> days) {
        this.days = days;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", days=" + days +
                '}' + super.toString();
    }
}
