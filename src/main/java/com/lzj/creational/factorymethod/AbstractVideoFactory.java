package com.lzj.creational.factorymethod;

/**
 * 功能：调用具体工厂的抽象工厂类。
 * 风格：正常的工厂方法模式。
 * 注意：任何设计模式都有优缺点，工厂模式虽然很好，可以让调用方不用知道
 * 具体的对象创建过程，并且基本上对修改是关闭的，扩展性很好（只需要增加
 * 新的具体工厂类和具体产品类就行了），但是其缺点也很明细，容易导致类的
 * 数量爆炸。所以要根据业务场景适量选择使用。
 *
 * @Author Sakura
 * @Date 2019/3/16 11:19
 */
public abstract class AbstractVideoFactory {
    /**
     * 获取视频的抽象方法。
     * @return
     */
    public abstract Video getVideo();
}
