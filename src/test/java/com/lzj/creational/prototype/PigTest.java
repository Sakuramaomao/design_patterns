package com.lzj.creational.prototype;

import java.util.Date;

/**
 * 深克隆和浅克隆的测试代码。
 *
 * @Author Sakura
 * @Date 20:56 2019/4/8
 */

public class PigTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        String name = "peiqi";
        Date date = new Date(0L);

        Pig pig1 = new Pig(name, date);
        Pig pig2 = (Pig) pig1.clone();

        System.out.println(pig1);
        System.out.println(pig2);

        pig1.getBirthday().setTime(66666666666666L);
        System.out.println(pig1);
        System.out.println(pig2);
    }
}