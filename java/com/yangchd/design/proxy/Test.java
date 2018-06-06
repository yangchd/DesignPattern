package com.yangchd.design.proxy;

/**
 * @author yangchd  2018/3/20.
 *
 * 代理模式
 * 在不改变接口的前提下，控制对象的访问。
 * 代理模式，是类之间的封装和（某方面的）复用
 */
public class Test {

    public static void main(String[] args) {
        Cafe cafe = new CafeProxy();
        cafe.getCafe();
    }

}
