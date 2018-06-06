package com.yangchd.design.adapter.clsadapter;

/**
 * @author yangchd  2018/3/20.
 *
 * 类的适配器模式
 * 有一个Source类，拥有一个方法，待适配，目标接口是Target，通过Adapter类，将Source的功能扩展到Target里
 * 这样Target接口的实现类就具有了Source类的功能
 */
public class AdapterTest {

    public static void main(String[] args) {
        Target target = new Adapter();
        target.method1();
        target.method2();
    }
}
