package com.lzj.structural.composite;

/**
 * 目课程录组件的父类，
 * 拥有默认的实现方法。
 *
 * 组合模式最重要的一点是，一个节点和其叶子节点都要继承或者实现相同的接口。
 *
 * @Author Sakura
 * @Date 2019/4/13 18:54
 */
public abstract class CatalogComponent {
    protected void add(CatalogComponent component) {
        throw new UnsupportedOperationException("目录不支持添加操作");
    }

    protected void remove(CatalogComponent component) {
        throw new UnsupportedOperationException("目录不支持删除操作");
    }

    protected void update(String componentName) {
        throw new UnsupportedOperationException("目录不支持修改操作");
    }

    protected void print() {
        throw new UnsupportedOperationException("目录不支持打印操作");
    }

}
