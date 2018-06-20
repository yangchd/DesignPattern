package com.yangchd.design.behavioral.visitor.demo.dept;

import com.yangchd.design.behavioral.visitor.demo.employee.FulltimeEmployee;
import com.yangchd.design.behavioral.visitor.demo.employee.ParttimeEmployee;

/**
 * @author yangchd  2018/6/20.
 *
 * 财务部类：具体访问者类
 */
public class FADepartment extends AbstractDepartment {
    @Override
    public void visit(FulltimeEmployee employee) {
        int workTime = employee.getWorkTime();
        double weekWage = employee.getWeeklyWage();
        if (workTime > 40) {
            weekWage = weekWage + (workTime - 40) * 100;
        } else if (workTime < 40) {
            weekWage = weekWage - (40 - workTime) * 80;
            if (weekWage < 0) {
                weekWage = 0;
            }
        }
        System.out.println("正式员工" + employee.getName() + "实际工资为：" + weekWage + "元。");
    }

    @Override
    public void visit(ParttimeEmployee employee) {
        int workTime = employee.getWorkTime();
        double hourWage = employee.getHourWage();
        System.out.println("临时工" + employee.getName() + "实际工资为：" + workTime * hourWage + "元。");
    }
}
