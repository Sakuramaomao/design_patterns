package com.lzj.structural.decorator.v2;

import org.junit.Test;

import static org.junit.Assert.*;

public class BatterCakeTest {
    @Test
    public void test() {
        AbstractBatterCake ABatterCake = new BatterCake();
        ABatterCake = new EggDecorator(ABatterCake);
        ABatterCake = new EggDecorator(ABatterCake);
        ABatterCake = new SausageDecorator(ABatterCake);

        System.out.println(ABatterCake.getDesc() + " 消费金额：" + ABatterCake.cost());
    }
}