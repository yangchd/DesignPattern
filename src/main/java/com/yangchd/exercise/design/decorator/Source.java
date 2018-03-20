package com.yangchd.exercise.design.decorator;

/**
 * @author yangchd  2018/3/20.
 */
public class Source implements SourceAble {

    @Override
    public void method() {
        System.out.println("the original method!");
    }
}
