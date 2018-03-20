package com.yangchd.exercise.design.bridge;


/**
 * @author yangchd  2018/3/20.
 */
public class SourceSub2 implements SourceAble {
    @Override
    public void method() {
        System.out.println("this is the second sub!");
    }
}