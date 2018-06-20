package com.yangchd.design.behavioral.template;

/**
 * @author yangchd  2018/6/15.
 *
 * Account：账户类，充当抽象类。
 */
public abstract class AbstractAccount {
    /**
     * 模板方法
     */
    public void handle(String account, String password) {
        if (!validate(account, password)) {
            System.out.println("账户或密码错误！");
            return;
        }
        calculateInterest();
        display();
    }

    /**
     * 基本方法——具体方法
     *
     * @param account  账号
     * @param password 密码
     * @return 是否成功
     */
    private boolean validate(String account, String password) {
        System.out.println("账号：" + account);
        System.out.println("密码：" + password);
        //模拟登录
        if ("张无忌".equals(account) && "123456".equals(password)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 基本方法——抽象方法
     */
    public abstract void calculateInterest();

    /**
     * 基本方法——具体方法
     */
    private void display() {
        System.out.println("显示利息！");
    }

}
