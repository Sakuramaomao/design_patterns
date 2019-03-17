package com.lzj.creational.simplefactory;

/**
 * 功能：生产Video的简单工厂类。
 * 风格：简单工厂的基础写法。
 * 注意：这个工厂能创建的类比较少，如果要创建多一些的，推荐使用
 *      ClazzVideoFactory中的反射写法。
 *
 * @Author Sakura
 * @Date 2019/3/16 11:19
 * @see ClazzVideoFactory 简单工厂的反射写法。
 */
public class VideoFactory {
    /**
     * 简单工厂，只需要传入所需的类型即可得到相应的实例。
     *
     * @param type 待生产的视频类型。
     * @return Video 视频。
     * @since  1.0
     */
    public Video getVideo(String type) {
        if ("Java".equals(type)) {
            return new JavaVideo();
        } else if ("Python".equals(type)) {
            return new PythonVideo();
        }
        return null;
    }
}
