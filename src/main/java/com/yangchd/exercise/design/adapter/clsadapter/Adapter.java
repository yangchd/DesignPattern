package com.yangchd.exercise.design.adapter.clsadapter;

/**
 * @author yangchd  2018/3/20.
 */
public class Adapter extends Source implements Target {

    @Override
    public void method2() {
        System.out.println("this is the target method!");
    }
}
