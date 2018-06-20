package com.yangchd.design.mediator.demo.mediator;

import com.yangchd.design.mediator.demo.component.AbstractComponent;

/**
 * @author yangchd  2018/6/20.
 *
 * 抽象中介者
 */
public abstract class AbstractMediator {
    /**
     * 维持各个对象的引用
     * @param c 对象
     */
    public abstract void componentChanged(AbstractComponent c);
}
