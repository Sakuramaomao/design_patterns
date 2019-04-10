package com.lzj.structural.decorator.v2;

/**
 * 抽象的装饰者。
 *
 * @Author Sakura
 * @Date 2019/4/9 21:57
 */
public abstract class AbstractDecorator extends AbstractBatterCake {
    private AbstractBatterCake abstractBatterCake;

    // 使用组合，抽象的装饰者包含抽象的被装饰者。
    public AbstractDecorator(AbstractBatterCake abstractBatterCake) {
        this.abstractBatterCake = abstractBatterCake;
    }

    // 这里让抽象的装饰者直接使用定义好的实体类BatterCake中的方法。
    // 这样做的好处是，抽象的被装饰者定义好了规范（有哪些方法可以被增强）。
    // 而被装饰者的实现类则给出了被装饰者的默认方法实现。
    @Override
    String getDesc() {
        return abstractBatterCake.getDesc();
    }

    @Override
    int cost() {
        return abstractBatterCake.cost();
    }

    // 留出的接口，可以让装饰者子类去实现自己特定的功能。
    abstract void doSomething();
}
