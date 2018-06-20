package com.yangchd.design.structural.adapter.objadapter;

/**
 * @author yangchd  2018/3/20.
 */
public class Wrapper implements Target {

    private Source source;

    public Wrapper(Source source){
        super();
        this.source = source;
    }
    @Override
    public void method2() {
        System.out.println("this is the target method!");
    }

    @Override
    public void method1() {
        source.method1();
    }
}
