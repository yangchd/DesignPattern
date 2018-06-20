package com.yangchd.design.creational.singleton;

/**
 * @author yangchd  2018/5/7.
 *
 * 饿汉模式
 *
 * 优点：相对于懒汉模式来说，简单
 *
 * 缺点：
 * 可能由于初始化的太早，造成资源的浪费
 * 如果初始化本身依赖于一些其他数据，那么也就很难保证其他数据会在它初始化之前准备好。
 *
 * 1. new一个对象时
 * 2. 使用反射创建它的实例时
 * 3. 子类被加载时，如果父类还没被加载，就先加载父类
 * 4. jvm启动时执行的主类会首先被加载
 *
 */
public class SingletonHungry {

    private static final SingletonHungry INSTANCE = new SingletonHungry();

    private SingletonHungry(){}

    public static SingletonHungry getInstance(){
        return INSTANCE;
    }
}
