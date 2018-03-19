package com.yangchd.exercise.design.factory.factory;

import com.yangchd.exercise.design.factory.sender.MailSender;
import com.yangchd.exercise.design.factory.sender.Sender;
import com.yangchd.exercise.design.factory.sender.SmsSender;

/**
 * @author yangchd  2018/3/17.
 */
public class NormalFactory {
    public static String MAIL = "mail";
    public static String SMS = "sms";

    public Sender produce(String type){
     if(MAIL.equals(type)){
         return new MailSender();
     }else if(SMS.equals(type)){
         return new SmsSender();
     }else {
         System.out.println("未找到的类型");
         return null;
     }
    }

    public Sender produceMail(){
        return new MailSender();
    }

    public Sender produceSms(){
        return new SmsSender();
    }
}
