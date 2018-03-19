package com.yangchd.exercise.design.factory;

import com.yangchd.exercise.design.factory.factory.*;
import com.yangchd.exercise.design.factory.sender.Sender;

/**
 * @author yangchd  2018/3/17.
 */
public class FactoryTest {
    public static void main(String[] args){
        NormalFactory normalFactory = new NormalFactory();

        // 普通工厂
        Sender mailSender = normalFactory.produce(NormalFactory.MAIL);
        mailSender.send();

        // 多个工厂
        Sender sender = normalFactory.produceSms();
        sender.send();

        // 静态工厂
        StaticFactory.produceMail().send();

        // 抽象工厂
        Factory provider = new SendSmsFactory();
        Sender abstractSender = provider.produce();
        abstractSender.send();
    }
}
