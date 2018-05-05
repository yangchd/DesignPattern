package com.yangchd.exercise.design.factory;

import com.yangchd.exercise.design.factory.factory.abstractfactory.Factory;
import com.yangchd.exercise.design.factory.factory.abstractfactory.SendSmsFactory;
import com.yangchd.exercise.design.factory.factory.normalfactory.NormalFactory;
import com.yangchd.exercise.design.factory.factory.staticfactory.StaticFactory;
import com.yangchd.exercise.design.factory.sender.Sender;

/**
 * @author yangchd  2018/3/17.
 *
 * 总体来说，工厂模式适合：凡是出现了大量的产品需要创建，并且具有共同的接口时，可以通过工厂方法模式进行创建。
 * 大多数情况下，我们会选用静态工厂方法模式、或者抽象工厂模式。
 *
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


        // 静态工厂，常用的工厂方法
        StaticFactory.produceMail().send();

        // 抽象工厂
        Factory provider = new SendSmsFactory();
        Sender abstractSender = provider.produce();
        abstractSender.send();
    }
}
