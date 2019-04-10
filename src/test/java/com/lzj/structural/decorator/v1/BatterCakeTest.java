package com.lzj.structural.decorator.v1;

import org.junit.Test;

/**
 * 使用继承的方式实现装饰模式。
 * 用一个鸡蛋和一个香肠来装饰煎饼。
 *
 * @Author Sakura
 * @Date 21:47 2019/4/9
 */

public class BatterCakeTest {
    @Test
    public void test() {
        BatterCake batterCake = new BatterCake();
        System.out.println(batterCake.getDesc() + " 销售价格：" + batterCake.cost());

        BatterCakeWithEgg batterCakeWithEgg = new BatterCakeWithEgg();
        System.out.println(batterCakeWithEgg.getDesc() + " 销售价格：" + batterCakeWithEgg.cost());

        BatterCakeWithEggSausage batterCakeWithEggSausage = new BatterCakeWithEggSausage();
        System.out.println(batterCakeWithEggSausage.getDesc() + " 销售价格：" + batterCakeWithEggSausage.cost());
    }
}