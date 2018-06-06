package com.yangchd.design.singleton;

/**
 * @author yangchd  2018/5/7.
 *
 * 它利用了ClassLoader来保证了同步，同时又能让开发者控制类加载的时机。从内部看是一个饿汉式的单例，但是从外部看来，又的确是懒汉式的实现。
 * 这种写法出自《Effective Java》
 */
public class SingletonHolder {

    /**
     * Singleton，它是一个饿汉式的单例实现，在Singleton初始化的时候会由ClassLoader来保证同步，使INSTANCE是一个真·单例。
     * 同时，由于Singleton是一个内部类，只在外部类的SingletonHolder的getInstance()中被使用，所以它被加载的时机也就是在getInstance()方法第一次被调用的时候。
     */
    private static class Singleton{
        private static final SingletonHolder SINGLETON_HOLDER_INSTANCE = new SingletonHolder();
    }
    private SingletonHolder(){}

    public static SingletonHolder getInstance(){
        return Singleton.SINGLETON_HOLDER_INSTANCE;
    }
}
