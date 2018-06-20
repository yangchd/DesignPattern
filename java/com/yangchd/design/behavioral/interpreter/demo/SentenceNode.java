package com.yangchd.design.behavioral.interpreter.demo;

/**
 * @author yangchd  2018/6/20.
 *
 * 简单句子解释：非终结符表达式
 */
public class SentenceNode extends AbstractNode {
    private AbstractNode direction;
    private AbstractNode action;
    private AbstractNode distance;

    public SentenceNode(AbstractNode direction,AbstractNode action,AbstractNode distance) {
        this.direction = direction;
        this.action = action;
        this.distance = distance;
    }

    @Override
    public String interpret() {
        return direction.interpret() + action.interpret() + distance.interpret();
    }
}
