package com.yangchd.exercise.design.singleton;

/**
 * @author yangchd  2018/3/17.
 *         饿汉模式
 *         这种方式基于classloder机制避免了多线程的同步问题
 */
public class SingletonHungry {
    private static SingletonHungry instance = new SingletonHungry();

    private SingletonHungry() {
    }

    public static SingletonHungry getInstance() {
        return instance;
    }
}
