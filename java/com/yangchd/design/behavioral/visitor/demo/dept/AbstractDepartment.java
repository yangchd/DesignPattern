package com.yangchd.design.behavioral.visitor.demo.dept;

import com.yangchd.design.behavioral.visitor.demo.employee.FulltimeEmployee;
import com.yangchd.design.behavioral.visitor.demo.employee.ParttimeEmployee;

/**
 * @author yangchd  2018/6/20.
 *
 * 部门类：抽象访问者类
 */
public abstract class AbstractDepartment {
    /**
     * 声明一组重载的访问方法，用于访问不同类型的具体元素
     * @param employee 全职员工
     */
    public abstract void visit(FulltimeEmployee employee);

    /**
     * 声明一组重载的访问方法，用于访问不同类型的具体元素
     * @param employee  兼职员工
     */
    public abstract void visit(ParttimeEmployee employee);
}
