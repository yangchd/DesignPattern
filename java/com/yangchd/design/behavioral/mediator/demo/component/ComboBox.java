package com.yangchd.design.behavioral.mediator.demo.component;

/**
 * @author yangchd  2018/6/20.
 *
 * 组合框类：具体同事类
 */
public class ComboBox extends AbstractComponent {
    @Override
    public void update() {
        System.out.println("组合框增加一项：张无忌。");
    }

    public void select() {
        System.out.println("组合框选中项：小龙女。");
    }
}
