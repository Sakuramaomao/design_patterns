package com.lzj.structural.decorator.v2;

/**
 * 被装饰者的一个具体实现。
 * 这个类的存在不是为了直接使用的，而是为了约束整个继承树的行为，
 * 比如：这个类是煎饼，通过装饰也不会变成其他的物品。
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
