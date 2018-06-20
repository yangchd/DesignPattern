package com.yangchd.design.behavioral.state.demo2;

/**
 * @author yangchd  2018/6/20.
 */
public abstract class AbstractState {
    /**
     * 打开
     * @param s 开关对象
     */
    public abstract void on(Switch s);

    /**
     * 关闭
     * @param s 开关对象
     */
    public abstract void off(Switch s);
}
