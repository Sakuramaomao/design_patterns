package com.lzj.structural.flyweight;

/**
 *
 *
 * @Author Sakura
 * @Date 2019/4/13 15:56
 */
public class Employee implements Report{
    private String department;
    private String Content;

    public Employee(String department) {
        this.department = department;
    }

    @Override
    public void report() {
        System.out.println(department + "部门经理做报告......");
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }
}
