package com.yangchd.design.factory.factory.abstractfactory;

import com.yangchd.design.factory.sender.Sender;

/**
 * @author yangchd  2018/3/17.
 */
public interface Factory {
    Sender produce();
}
