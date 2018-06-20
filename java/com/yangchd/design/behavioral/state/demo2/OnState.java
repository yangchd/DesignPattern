package com.yangchd.design.behavioral.state.demo2;

/**
 * @author yangchd  2018/6/20.
 */
public class OnState extends AbstractState {

    @Override
    public void on(Switch s) {
        System.out.println("已经打开！");
    }

    @Override
    public void off(Switch s) {
        System.out.println("关闭！");
        s.setState(Switch.getState("off"));
    }
} 