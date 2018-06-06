package com.yangchd.design.decorator;

/**
 * @author yangchd  2018/3/20.
 * 装饰角色
 */
public class Decorator implements Cafe{

    private Cafe cafe;

    public Decorator(Cafe cafe) {
        this.cafe = cafe;
    }

    @Override
    public void getCafe() {
        cafe.getCafe();
    }

}
