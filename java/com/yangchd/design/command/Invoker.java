package com.yangchd.design.command;

/**
 * @author yangchd  2018/6/19.
 */
public class Invoker {
    /**
     * 维持一个CommandQueue对象的引用
     */
    private CommandQueue commandQueue;

    /**
     * 构造注入
     *
     * @param commandQueue 命令队列
     */
    public Invoker(CommandQueue commandQueue) {
        this.commandQueue = commandQueue;
    }

    /**
     * 设值注入
     *
     * @param commandQueue 命令队列
     */
    public void setCommandQueue(CommandQueue commandQueue) {
        this.commandQueue = commandQueue;
    }

    /**
     * 调用CommandQueue类的execute()方法
     */
    public void call() {
        commandQueue.execute();
    }
}
