package com.yangchd.design.factory.factory.normalfactory;

import com.yangchd.design.factory.sender.MailSender;
import com.yangchd.design.factory.sender.Sender;
import com.yangchd.design.factory.sender.SmsSender;

/**
 * @author yangchd  2018/3/17.
 */
public class NormalFactory {
    public static String MAIL = "mail";
    public static String SMS = "sms";

    /**
     * 普通工厂模式，这种方式，需要传递的字符串绝对不出错
     */
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

    /**
     * 多工厂模式，相对普通的，不会出现字符串错误问题
     */
    public Sender produceMail(){
        return new MailSender();
    }

    public Sender produceSms(){
        return new SmsSender();
    }
}
