package com.yangchd.design.strategy;

/**
 * @author yangchd  2018/6/15.
 *
 * 策略模式(Strategy Pattern)：
 * 定义一系列算法类，将每一个算法封装起来，并让它们可以相互替换
 * 策略模式让算法独立于使用它的客户而变化，也称为政策模式(Policy)。策略模式是一种对象行为型模式。
 *
 * 在客户端代码中只需注入一个具体策略对象，可以将具体策略类类名存储在配置文件中，通过反射来动态创建具体策略对象，
 * 从而使得用户可以灵活地更换具体策略类，增加新的具体策略类也很方便。
 *
 * 策略模式提供了一种可插入式(Pluggable)算法的实现方案
 */
public class StrategyPattern {
    public static void main(String[] args) {
        MovieTicket mt = new MovieTicket();
        double originalPrice = 60.0;
        double currentPrice;

        mt.setPrice(originalPrice);
        System.out.println("原始价为：" + originalPrice);
        System.out.println("---------------------------------");

        // 设置折扣模式——这里可以通过切换不同的折扣子类，达到计算不同折扣的目的
        Discount discount = new StudentDiscount();
        // 注入折扣对象
        mt.setDiscount(discount);
        // 计算折扣后价格
        currentPrice = mt.getPrice();

        System.out.println("折后价为：" + currentPrice);
    }
}
