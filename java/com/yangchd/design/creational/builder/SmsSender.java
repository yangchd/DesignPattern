package com.yangchd.design.creational.builder;

/**
 * @author yangchd  2018/3/17.
 */
public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is SmsSender!");
    }
}
