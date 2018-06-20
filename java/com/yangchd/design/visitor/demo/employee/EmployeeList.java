package com.yangchd.design.visitor.demo.employee;

import com.yangchd.design.visitor.demo.dept.AbstractDepartment;

import java.util.ArrayList;

/**
 * @author yangchd  2018/6/20.
 *
 * 员工列表类：对象结构
 */
public class EmployeeList {
    /**
     * 定义一个集合用于存储员工对象
     */
    private ArrayList<Employee> list = new ArrayList<>();

    public void addEmployee(Employee employee) {
        list.add(employee);
    }

    /**
     * 遍历访问员工集合中的每一个员工对象
     * @param handler   访问者
     */
    public void accept(AbstractDepartment handler) {
        for (Employee obj : list) {
            obj.accept(handler);
        }
    }
}
