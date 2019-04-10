package com.lzj.structural.decorator.v2;

/**
 * 实际的装饰者。
 *
 * @Author Sakura
 * @Date 2019/4/9 22:03
 */
public class EggDecorator extends AbstractDecorator {

    public EggDecorator(AbstractBatterCake abstractBatterCake) {
        super(abstractBatterCake);
    }

    @Override
    String getDesc() {
        return super.getDesc() + "加一个鸡蛋";
    }

    @Override
    int cost() {
        return super.cost() + 1;
    }
}
