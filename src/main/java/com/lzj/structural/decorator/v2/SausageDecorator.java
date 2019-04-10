package com.lzj.structural.decorator.v2;

/**
 * @Author Sakura
 * @Date 2019/4/9 22:06
 */
public class SausageDecorator extends AbstractDecorator {
    public SausageDecorator(AbstractBatterCake abstractBatterCake) {
        super(abstractBatterCake);
    }

    @Override
    String getDesc() {
        return super.getDesc() + "加一根香肠";
    }

    @Override
    int cost() {
        return super.cost() + 2;
    }

    @Override
    void doSomething() {

    }
}
