package com.yangchd.design.creational.factory.factory.staticfactory;

import com.yangchd.design.creational.factory.sender.SmsSender;
import com.yangchd.design.creational.factory.sender.MailSender;
import com.yangchd.design.creational.factory.sender.Sender;

/**
 * @author yangchd  2018/3/17.
 */
public class StaticFactory {
    public static Sender produceMail(){
        return new MailSender();
    }

    public static Sender produceSms(){
        return new SmsSender();
    }
}
