package com.yangchd.design.behavioral.observer;

/**
 * @author yangchd  2018/6/15.
 *
 * 抽象观察类
 */
public interface Observer {

    String getName();
    void setName(String name);

    /**
     * 声明支援盟友方法
     */
    void help();

    /**
     * 声明遭受攻击方法
     * @param acc 控制中心
     */
    void beAttacked(AbstractControlCenter acc);
}
