package com.lzj.creational.prototype;

import java.util.Date;

/**
 * 小猪佩奇~~
 *
 * @Author Sakura
 * @Date 2019/4/8 20:52
 */
public class Pig implements Cloneable{
    private String name;
    // 注意这里是个引用类型，这个字段的拷贝默认使用的是浅拷贝。
    private Date birthday;

    public Pig(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // 先进行一次浅克隆。
        Pig pig = (Pig) super.clone();
        // 对于其中的引用数据类型，调用其父类的clone方法再对Date对象进行一次克隆。
        // 这里的this.birthday.clone()调用的是Date类中自己覆写的clone方法，不是Object中的本地clone方法。
        pig.birthday = (Date) this.birthday.clone();
        // 返回的就是深克隆的pig。
        return pig;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}' + super.toString();
    }
}
