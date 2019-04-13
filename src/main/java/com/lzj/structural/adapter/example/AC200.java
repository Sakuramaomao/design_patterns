package com.lzj.structural.adapter.example;

/**
 * 被适配者。
 *
 * @Author Sakura
 * @Date 2019/4/11 21:51
 */
public class AC200 {
    protected int outputAC200() {
        int outputAC = 220;
        System.out.println("输出电压：" + outputAC + "V");
        return outputAC;
    }
}
