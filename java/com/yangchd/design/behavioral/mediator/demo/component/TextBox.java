package com.yangchd.design.behavioral.mediator.demo.component;

/**
 * @author yangchd  2018/6/20.
 *
 * 文本框类：具体同事类
 */
public class TextBox extends AbstractComponent {
    @Override
    public void update() {
        System.out.println("客户信息增加成功后文本框清空。");
    }

    public void setText() {
        System.out.println("文本框显示：小龙女。");
    }
}
