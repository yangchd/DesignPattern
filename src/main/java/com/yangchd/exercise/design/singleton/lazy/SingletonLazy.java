package com.yangchd.exercise.design.singleton.lazy;

/**
 * @author yangchd  2018/3/17.
 *
 * 懒汉模式，线程不安全
 */
public class SingletonLazy {

    private static SingletonLazy instance = null;

    /**
     * 构造方法私有化，防止外部类调用
     */
    private SingletonLazy() {}

    public static SingletonLazy getInstance() {
        if(instance == null){
            instance = new SingletonLazy();
        }
        return instance;
    }
}
