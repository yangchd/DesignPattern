package com.yangchd.design.behavioral.state.demo2;

/**
 * @author yangchd  2018/6/20.
 */
public class Switch {
    /**
     * 定义三个静态的状态对象
     */
    private static AbstractState state, onState, offState;
    private String name;

    public Switch(String name) {
        this.name = name;
        onState = new OnState();
        offState = new OffState();
        state = onState;
    }
    /**
     * 打开开关
     */
    public void on() {
        System.out.print(name);
        state.on(this);
    }

    /**
     * 关闭开关
     */
    public void off() {
        System.out.print(name);
        state.off(this);
    }

    public void setState(AbstractState state) {
        Switch.state = state;
    }

    public static AbstractState getState(String type) {
        if ("on".equalsIgnoreCase(type)) {
            return onState;
        } else {
            return offState;
        }
    }
}
