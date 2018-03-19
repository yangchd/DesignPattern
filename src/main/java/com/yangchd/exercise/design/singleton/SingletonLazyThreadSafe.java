package com.yangchd.exercise.design.singleton;

/**
 * @author yangchd  2018/3/17.
 *         懒汉模式单例，线程安全
 */
public class SingletonLazyThreadSafe {
    private static SingletonLazyThreadSafe instance;

    private SingletonLazyThreadSafe() {
    }

    public static synchronized SingletonLazyThreadSafe getInstance() {
        if (null == instance) {
            instance = new SingletonLazyThreadSafe();
        }
        return instance;
    }
}
