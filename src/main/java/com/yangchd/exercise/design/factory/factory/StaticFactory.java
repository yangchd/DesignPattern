package com.yangchd.exercise.design.factory.factory;

import com.yangchd.exercise.design.factory.sender.MailSender;
import com.yangchd.exercise.design.factory.sender.Sender;
import com.yangchd.exercise.design.factory.sender.SmsSender;

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
