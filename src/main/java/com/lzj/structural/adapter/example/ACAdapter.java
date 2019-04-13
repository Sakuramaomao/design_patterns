package com.lzj.structural.adapter.example;

/**
 * AC200的适配器，这里优先使用对象适配器模式，
 * 因为多用组合，少用继承。
 * @Author Sakura
 * @Date 2019/4/11 21:54
 */
public class ACAdapter implements DC5{
    private AC200 ac200 = new AC200();

    @Override
    public int outputDC5() {
        int outputAC200 = ac200.outputAC200();
        // 模拟变压器。
        int outputDC5 = outputAC200/44;
        System.out.println("变压后输出：" + outputDC5 + "V");
        return outputDC5;
    }
}
