package com.lzj.structural.decorator.v2;

/**
 * 被装饰者实例。
 *
 * @Author Sakura
 * @Date 2019/4/9 21:56
 */
public class BatterCake extends AbstractBatterCake {
    @Override
    String getDesc() {
        return "煎饼";
    }

    @Override
    int cost() {
        return 8;
    }
}
