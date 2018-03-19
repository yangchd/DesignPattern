package com.yangchd.exercise.design.factory.factory;

import com.yangchd.exercise.design.factory.sender.Sender;
import com.yangchd.exercise.design.factory.sender.SmsSender;

/**
 * @author yangchd  2018/3/17.
 */
public class SendSmsFactory implements Factory {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
