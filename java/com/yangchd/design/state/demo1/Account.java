package com.yangchd.design.state.demo1;

/**
 * @author yangchd  2018/6/20.
 *
 * 银行账户：环境类
 */
public class Account {
    /**
     * 维持一个对抽象状态对象的引用
     */
    private AccountState state;
    /**
     * 开户名
     */
    private String owner;
    /**
     * 账户余额
     */
    private double balance = 0;

    public Account(String owner, double init) {
        this.owner = owner;
        this.balance = init;
        //设置初始状态
        this.state = new NormalState(this);
        System.out.println(this.owner + "开户，初始金额为" + init);
        System.out.println("---------------------------------------------");
    }

    public void deposit(double amount) {
        System.out.println(this.owner + "存款" + amount);

        //调用状态对象的deposit()方法
        state.deposit(amount);
        System.out.println("现在余额为" + this.balance);
        System.out.println("现在帐户状态为" + this.state.getClass().getName());
        System.out.println("---------------------------------------------");
    }

    public void withdraw(double amount) {
        System.out.println(this.owner + "取款" + amount);

        //调用状态对象的withdraw()方法
        state.withdraw(amount);
        System.out.println("现在余额为" + this.balance);
        System.out.println("现在帐户状态为" + this.state.getClass().getName());
        System.out.println("---------------------------------------------");
    }

    public void computeInterest() {
        //调用状态对象的computeInterest()方法
        state.computeInterest();
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setState(AccountState state) {
        this.state = state;
    }
}
