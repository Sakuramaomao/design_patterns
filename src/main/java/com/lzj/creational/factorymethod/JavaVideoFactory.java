package com.lzj.creational.factorymethod;

/**
 * 生产JavaVideo工厂的具体实现类。
 *
 * @Author Sakura
 * @Date 2019/3/16 15:56
 */
public class JavaVideoFactory extends AbstractVideoFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
