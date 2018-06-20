package com.yangchd.design.behavioral.state.demo1;

/**
 * @author yangchd  2018/6/20.
 *
 * 抽象状态类
 */
public abstract class AccountState {
    /**
     * 状态关联的账户
     */
    protected Account acc;

    /**
     * 存款操作
     *
     * @param amount 金额
     */
    public abstract void deposit(double amount);

    /**
     * 取款操作
     *
     * @param amount 金额
     */
    public abstract void withdraw(double amount);

    /**
     * 计算利息
     */
    public abstract void computeInterest();

    /**
     * 状态校验
     */
    public abstract void stateCheck();
}
