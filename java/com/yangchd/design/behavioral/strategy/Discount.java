package com.yangchd.design.behavioral.strategy;

/**
 * @author yangchd  2018/6/15.
 * 折扣类：抽象策略类
 */
public interface Discount {
    /**
     * 计算价格接口
     *
     * @param price 原价
     * @return 折扣价
     */
    double calculate(double price);
}
