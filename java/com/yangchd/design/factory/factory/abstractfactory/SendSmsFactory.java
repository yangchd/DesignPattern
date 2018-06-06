package com.yangchd.design.factory.factory.abstractfactory;

import com.yangchd.design.factory.sender.Sender;
import com.yangchd.design.factory.sender.SmsSender;

/**
 * @author yangchd  2018/3/17.
 */
public class SendSmsFactory implements Factory {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
