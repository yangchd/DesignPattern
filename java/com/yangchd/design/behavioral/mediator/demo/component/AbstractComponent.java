package com.yangchd.design.behavioral.mediator.demo.component;

import com.yangchd.design.behavioral.mediator.demo.mediator.AbstractMediator;

/**
 * @author yangchd  2018/6/20.
 *
 * 抽象组件类：抽象同事类
 */
public abstract class AbstractComponent {

    protected AbstractMediator mediator;

    public void setMediator(AbstractMediator mediator) {
        this.mediator = mediator;
    }

    /**
     * 转发调用
     */
    public void changed() {
        mediator.componentChanged(this);
    }

    /**
     * 具体动作
     */
    public abstract void update();
}
