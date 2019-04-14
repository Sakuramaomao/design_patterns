package com.lzj.structural.composite;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 组合模式的例子。
 * 场景：目录结构。
 */
public class CatalogComponentTest {
    @Test
    public void test() {
        CatalogComponent javaCatalog = new Catalog("Java课程目录", 2);
        CatalogComponent thread = new Course("Java多线程视频");
        CatalogComponent designPattern = new Course("Java设计模式精讲视频");

        CatalogComponent linuxCatalog = new Catalog("Linux课程目录", 2);
        CatalogComponent windowsCatalog = new Catalog("windows课程目录", 2);

        CatalogComponent catalog = new Catalog("慕课网视频课程", 1);

        javaCatalog.add(thread);
        javaCatalog.add(designPattern);

        catalog.add(javaCatalog);
        catalog.add(linuxCatalog);
        catalog.add(windowsCatalog);

        //javaCatalog.print();
        catalog.print();
    }
}