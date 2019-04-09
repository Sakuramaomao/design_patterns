package com.lzj.creational.prototype;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class DogTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        String name = "Alex";
        Date date1 = new Date(0L);
        Date date2 = new Date(6666666666666L);
        Date date3 = new Date(9999999999999L);
        List<Date> dateList = Arrays.asList(date1, date2, date3);

        Dog dog = new Dog(name, dateList);
        Dog cloneDog = (Dog) dog.clone();
        System.out.println(dog);
        System.out.println(cloneDog);

        dog.getDays().set(0, new Date(111111L));
        System.out.println(dog);
        System.out.println(cloneDog);
    }
}