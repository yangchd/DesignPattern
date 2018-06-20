package com.yangchd.design.behavioral.interpreter.demo;

/**
 * @author yangchd  2018/6/20.
 *
 * 方向解释：终结符表达式
 */
public class DirectionNode extends AbstractNode {
    private String direction;

    public DirectionNode(String direction) {
        this.direction = direction;
    }

    @Override
    public String interpret() {
        if ("up".equalsIgnoreCase(direction)) {
            return "向上";
        } else if ("down".equalsIgnoreCase(direction)) {
            return "向下";
        } else if ("left".equalsIgnoreCase(direction)) {
            return "向左";
        } else if ("right".equalsIgnoreCase(direction)) {
            return "向右";
        } else {
            return "无效指令";
        }
    }
}
