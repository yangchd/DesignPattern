package com.yangchd.design.structural.bridge;


/**
 * @author yangchd  2018/3/20.
 */
public class SourceSub1 implements SourceAble {
    @Override
    public void method() {
        System.out.println("this is the first sub!");
    }
}