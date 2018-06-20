package com.yangchd.design.creational.singleton;

/**
 * @author yangchd  2018/5/7.
 *
 * 懒汉模式，线程安全
 */
public class SingletonLazySyn {

    private static SingletonLazySyn instance = null;

    private SingletonLazySyn() {}

    /**
     * 通过添加synchronized关键字，保证多线程下的正常运行。
     * 但是这种方法，每一次调用的时候都需要加锁，很浪费资源
     * 其实是为了解决1%几率的问题，而使用了一个100%出现的防护盾
     */
    public synchronized static SingletonLazySyn getInstance() {
        if (instance == null) {
            instance = new SingletonLazySyn();
        }
        return instance;
    }

}
