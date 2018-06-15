package com.yangchd.design.template;

/**
 * @author yangchd  2018/6/15.
 *
 * CurrentAccount：活期账户类，充当具体子类。
 */
public class CurrentAccount extends AbstractAccount {

    /**
     * 覆盖父类的抽象基本方法
     */
    @Override
    public void calculateInterest() {
        System.out.println("按活期利率计算利息！");
    }
}
