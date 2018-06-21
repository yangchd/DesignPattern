package com.yangchd.design.creational.factory.factorymethod;

/**
 * @author yangchd  2018/3/17.
 */
public interface Factory {
    /**
     * 生产方法
     * @return 返回Sender的子类
     */
    Sender produce();
}
