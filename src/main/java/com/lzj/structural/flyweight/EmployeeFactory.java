package com.lzj.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元模式练习。
 * 员工的工厂类。
 *
 * @Author Sakura
 * @Date 2019/4/13 15:58
 */
public class EmployeeFactory {
    private static final Map<String, Employee> EMPLOYEE_MAP = new HashMap();

    public static Employee getInstance(String department) {
        /* 其中，department是由外部传入的，所以属于外部状态的享元模式。 */
        Employee employee = EMPLOYEE_MAP.get(department);

        if (employee == null) {
            employee = new Employee(department);
            System.out.println("创建" + department + "部门经理");
            EMPLOYEE_MAP.put(department, employee);
        }

        return employee;
    }
}
