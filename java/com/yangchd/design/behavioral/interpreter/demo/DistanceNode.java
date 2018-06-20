package com.yangchd.design.behavioral.interpreter.demo;

/**
 * @author yangchd  2018/6/20.
 *
 * 距离解释：终结符表达式
 */
public class DistanceNode extends AbstractNode {
    private String distance;

    public DistanceNode(String distance) {
        this.distance = distance;
    }

    @Override
    public String interpret() {
        return this.distance;
    }
}
