package com.yangchd.design.factory.factory.abstractfactory;

import com.yangchd.design.factory.sender.MailSender;
import com.yangchd.design.factory.sender.Sender;

/**
 * @author yangchd  2018/3/17.
 */
public class SendMailFactory implements Factory {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
