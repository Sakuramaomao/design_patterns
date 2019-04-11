package com.lzj.structural.adapter;

import com.lzj.structural.adapter.classadapter.Adapter;
import com.lzj.structural.adapter.classadapter.Target;
import org.junit.Test;

public class AdapterTest {
    // 类适配器写法。
    @Test
    public void test() {
        Target adapterTarget = new Adapter();
        adapterTarget.request();
    }

    // 对象适配器写法。
    @Test
    public void test2() {
        com.lzj.structural.adapter.objectadapter.Target objAdapterTarget = new com.lzj.structural.adapter.objectadapter.Adapter();
        objAdapterTarget.request();
    }

}