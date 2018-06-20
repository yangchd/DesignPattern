package com.yangchd.design.visitor.demo.employee;

import com.yangchd.design.visitor.demo.dept.AbstractDepartment;

/**
 * @author yangchd  2018/6/20.
 *
 * 员工类：抽象元素类
 */
public interface Employee {
    /**
     * 接受一个抽象访问者访问
     *
     * @param handler   访问者
     */
    void accept(AbstractDepartment handler);
}
