package com.lzj.creational.simplefactory;

/**
 * 功能：生产Video的简单工厂类。
 * 风格：简单工厂的反射写法。
 * 注意：反射写法可以增加工厂创建对象的个数，并且可以防止Facotry中过多的判断。
 *
 * @Author Sakura
 * @Date 2019/3/16 11:57
 * @see VideoFactory 简单工厂的基础写法。
 */
public class ClazzVideoFactory {
    private Video video = null;

    /**
     * 简单工厂模式的另一种写法。
     *
     * @param clazz 类的Class对象。
     * @return video。
     */
    public Video getVideo(Class clazz) {
        try {
           video = (Video) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }
}
