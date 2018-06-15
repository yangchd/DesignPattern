package com.yangchd.design.strategy;

/**
 * @author yangchd  2018/6/15.
 * 学生票折扣类：具体策略类
 */
public class StudentDiscount implements Discount {
    @Override
    public double calculate(double price) {
        System.out.println("学生票：");
        return price * 0.8;
    }
}