package com.yangchd.design.behavioral.interpreter.demo;

import java.util.Stack;

/**
 * @author yangchd  2018/6/20.
 */
public class InstructionHandler {
    private String instruction;
    private AbstractNode node;

    public void handle(String instruction) {
        AbstractNode left = null, right = null;
        AbstractNode direction = null, action = null, distance = null;

        //声明一个栈对象用于存储抽象语法树
        Stack<AbstractNode> stack = new Stack<>();
        //以空格分隔指令字符串
        String[] words = instruction.split(" ");
        //本实例采用栈的方式来处理指令，如果遇到“and”，则将其后的三个单词作为三个终结符表达式连成一个简单句子SentenceNode作为“and”的右表达式，
        // 而将从栈顶弹出的表达式作为“and”的左表达式，最后将新的“and”表达式压入栈中。
        for (int i = 0; i < words.length; i++) {
            if ("and".equalsIgnoreCase(words[i])) {
                //弹出栈顶表达式作为左表达式
                left = (AbstractNode) stack.pop();
                String word1 = words[++i];
                direction = new DirectionNode(word1);
                String word2 = words[++i];
                action = new ActionNode(word2);
                String word3 = words[++i];
                distance = new DistanceNode(word3);
                //右表达式
                right = new SentenceNode(direction, action, distance);
                //将新表达式压入栈中
                stack.push(new AndNode(left, right));
            }else {
                //如果是从头开始进行解释，则将前三个单词组成一个简单句子SentenceNode并将该句子压入栈中
                String word1 = words[i];
                direction = new DirectionNode(word1);
                String word2 = words[++i];
                action = new ActionNode(word2);
                String word3 = words[++i];
                distance = new DistanceNode(word3);
                left = new SentenceNode(direction, action, distance);
                //将新表达式压入栈中
                stack.push(left);
            }
        }
        //将全部表达式从栈中弹出
        this.node = stack.pop();
    }

    public String output() {
        //解释表达式
        return node.interpret();
    }
}
