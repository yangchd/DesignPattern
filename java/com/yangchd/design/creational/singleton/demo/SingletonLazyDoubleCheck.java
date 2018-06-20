package com.yangchd.design.creational.singleton.demo;

/**
 * @author yangchd  2018/5/7.
 *
 * 懒汉模式 双重检查
 */
public class SingletonLazyDoubleCheck {

    /**
     * 给instance添加volatile属性，保证了在instance赋值期间，不会发生指令重排
     * 这里需要了解“原子操作”，“指令重排”这两个概念！
     */
    private static volatile SingletonLazyDoubleCheck instance = null;

    private SingletonLazyDoubleCheck(){}

    /**
     * 第一个if (instance == null)，其实是为了解决Version2中的效率问题，只有instance为null的时候，才进入synchronized的代码段——大大减少了几率。
     * 第二个if (instance == null)，是为了防止可能出现多个实例的情况。
     */
    public static SingletonLazyDoubleCheck getInstance(){
        if(instance == null){
            synchronized(SingletonLazyDoubleCheck.class){
                if(instance == null){
                    instance = new SingletonLazyDoubleCheck();
                }
            }
        }
        return instance;
    }

}
