package com.yangchd.exercise.design.factory.factory.abstractfactory;

import com.yangchd.exercise.design.factory.sender.Sender;

/**
 * @author yangchd  2018/3/17.
 */
public interface Factory {
    Sender produce();
}
