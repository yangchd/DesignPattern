package com.yangchd.design.creational.factory.factorymethod;

/**
 * @author yangchd  2018/3/17.
 */
public class SendMailFactory implements Factory {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
