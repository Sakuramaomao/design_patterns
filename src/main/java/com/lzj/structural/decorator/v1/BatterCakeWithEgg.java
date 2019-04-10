package com.lzj.structural.decorator.v1;

/**
 * 煎饼加一个鸡蛋。
 *
 * @Author Sakura
 * @Date 2019/4/9 21:44
 */
public class BatterCakeWithEgg extends BatterCake {
    @Override
    protected String getDesc() {
        return super.getDesc() + "加一个鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost() + 1;
    }
}
