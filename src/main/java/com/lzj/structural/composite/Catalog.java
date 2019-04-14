package com.lzj.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 课程目录类。是课程类的父节点。
 * 它们都继承了相同的抽象类。
 *
 * @Author Sakura
 * @Date 2019/4/13 19:04
 */
public class Catalog extends CatalogComponent {
    private String catalogName;
    private Integer level;

    private List<CatalogComponent> catalogList = new ArrayList<>();

    public Catalog(String catalogName, Integer level) {
        this.catalogName = catalogName;
        this.level = level;
    }

    @Override
    protected void add(CatalogComponent component) {
        this.catalogList.add(component);
    }

    @Override
    protected void remove(CatalogComponent component) {
        this.catalogList.remove(component);
    }

    @Override
    protected void print() {
        // 打印当前目录的名称。
        System.out.println(catalogName);
        // 打印当前目录下的所有文件名称。
        catalogList.forEach(item -> {
            if (this.level != null) {
                for (int i=0; i<level; i++) {
                    System.out.print("**");
                }
            }
            item.print();
        });
    }
}
