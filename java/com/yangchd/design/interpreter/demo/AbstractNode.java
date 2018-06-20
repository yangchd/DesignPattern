package com.yangchd.design.interpreter.demo;

/**
 * @author yangchd  2018/6/20.
 *
 * 抽象表达式
 */
public abstract class AbstractNode {
    /**
     * 执行解释方法
     * @return  解释结果
     */
    public abstract String interpret();
}
