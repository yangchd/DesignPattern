package com.yangchd.design.creational.factory.factorymethod;

/**
 * @author yangchd  2018/3/17.
 */
public class SendSmsFactory implements Factory {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
