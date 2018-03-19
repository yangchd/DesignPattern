package com.yangchd.exercise.design.singleton;

/**
 * @author yangchd  2018/3/17.
 *         懒汉模式单例，线程不安全
 */
public class SingletonLazyThreadNotSafe {
    private static SingletonLazyThreadNotSafe instance;

    private SingletonLazyThreadNotSafe() {
    }

    public static SingletonLazyThreadNotSafe getInstance() {
        if (null == instance) {
            instance = new SingletonLazyThreadNotSafe();
        }
        return instance;
    }
}
