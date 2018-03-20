package com.yangchd.exercise.design.builder;

/**
 * @author yangchd  2018/3/19.
 */
public class BuilderTest {
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.produceMailSender(10);
    }
}
