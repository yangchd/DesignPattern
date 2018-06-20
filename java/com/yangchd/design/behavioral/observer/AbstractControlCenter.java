package com.yangchd.design.behavioral.observer;

import java.util.ArrayList;

/**
 * @author yangchd  2018/6/15.
 */
public abstract class AbstractControlCenter {
    /**
     * 战队名称
     */
    protected String allyName;
    /**
     * 定义一个集合用于存储战队成员
     */
    protected ArrayList<Observer> players = new ArrayList<>();

    public void setAllyName(String allyName) {
        this.allyName = allyName;
    }

    public String getAllyName() {
        return this.allyName;
    }

    /**
     * 注册方法
     */
    public void join(Observer obs) {
        System.out.println(obs.getName() + "加入" + this.allyName + "战队！");
        players.add(obs);
    }
    /**
     * 注销方法
     */
    public void quit(Observer obs) {
        System.out.println(obs.getName() + "退出" + this.allyName + "战队！");
        players.remove(obs);
    }

    /**
     * 声明抽象通知方法
     * @param name  名字
     */
    public abstract void notifyObserver(String name);
}
