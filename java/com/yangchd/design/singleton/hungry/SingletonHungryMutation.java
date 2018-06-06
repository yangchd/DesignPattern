package com.yangchd.design.singleton.hungry;

/**
 * @author yangchd  2018/3/17.
 *
 * 饿汉变种模式
 */
public class SingletonHungryMutation {
    private static SingletonHungryMutation instance = null;

    static {
        instance = new SingletonHungryMutation();
    }

    private SingletonHungryMutation() {
    }

    public static SingletonHungryMutation getInstance() {
        return instance;
    }
}
