package com.yangchd.design.creational.factory.simplefactory;

/**
 * @author yangchd  2018/6/21.
 *
 * 简单工厂
 */
public class SenderFactory {

    /**
     * 获得发送
     *
     * @param type  工厂类型
     * @return      发送类
     */
    public static Sender getSender(String type) {
        if("mail".equals(type)){
            return new MailSender();
        }else if("sms".equals(type)){
            return new SmsSender();
        }else {
            System.out.println("未找到的类型");
            return null;
        }
    }
}
