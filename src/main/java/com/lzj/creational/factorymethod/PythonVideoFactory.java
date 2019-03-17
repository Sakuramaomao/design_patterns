package com.lzj.creational.factorymethod;

/**
 * 生产PythonVideo工厂的具体实现类。
 *
 * @Author Sakura
 * @Date 2019/3/16 16:04
 */
public class PythonVideoFactory extends AbstractVideoFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
