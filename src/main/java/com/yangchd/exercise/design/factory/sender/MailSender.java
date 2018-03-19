package com.yangchd.exercise.design.factory.sender;

/**
 * @author yangchd  2018/3/17.
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is MailSender!");
    }
}
