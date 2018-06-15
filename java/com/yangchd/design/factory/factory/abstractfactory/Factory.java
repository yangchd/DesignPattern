package com.yangchd.design.factory.factory.abstractfactory;

import com.yangchd.design.factory.sender.Sender;

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
