package com.yangchd.design.behavioral.strategy;

/**
 * @author yangchd  2018/6/15.
 * VIP会员票折扣类：具体策略类
 */
public class VIPDiscount implements Discount {
    @Override
    public double calculate(double price) {
        System.out.println("VIP票：");
        System.out.println("增加积分！");
        return price * 0.5;
    }
}
