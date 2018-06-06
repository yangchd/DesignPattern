package com.yangchd.design.factory.factory.staticfactory;

import com.yangchd.design.factory.sender.MailSender;
import com.yangchd.design.factory.sender.Sender;
import com.yangchd.design.factory.sender.SmsSender;

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
