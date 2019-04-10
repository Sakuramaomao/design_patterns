package com.lzj.structural.decorator.v1;

/**
 * @Author Sakura
 * @Date 2019/4/9 21:46
 */
public class BatterCakeWithEggSausage extends BatterCakeWithEgg {
    @Override
    protected String getDesc() {
        return super.getDesc() + "加一个香肠";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}
