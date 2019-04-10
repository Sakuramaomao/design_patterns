package com.lzj.structural.decorator.v2;

/**
 * 抽象的装饰者。
 *
 * @Author Sakura
 * @Date 2019/4/9 21:57
 */
public class AbstractDecorator extends AbstractBatterCake {
    private AbstractBatterCake abstractBatterCake;

    // 使用组合，包含抽象的被装饰者。
    public AbstractDecorator(AbstractBatterCake abstractBatterCake) {
        this.abstractBatterCake = abstractBatterCake;
    }

    @Override
    String getDesc() {
        return abstractBatterCake.getDesc();
    }

    @Override
    int cost() {
        return abstractBatterCake.cost();
    }
}
