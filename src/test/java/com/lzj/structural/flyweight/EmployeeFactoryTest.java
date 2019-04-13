package com.lzj.structural.flyweight;

import org.junit.Test;

/**
 * 享元模式的练习。
 * 让部门经理来报道。
 */
public class EmployeeFactoryTest {
    @Test
    public void test() {
        String[] departments = new String[]{"PD", "RT", "DO"};

        for (int i = 0; i < 10; i++) {
            String department = departments[(int) (Math.random() * departments.length)];
            Employee employee = EmployeeFactory.getInstance(department);
            employee.report();
        }
    }
}