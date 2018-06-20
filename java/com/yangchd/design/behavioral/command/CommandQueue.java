package com.yangchd.design.behavioral.command;

import java.util.ArrayList;

/**
 * @author yangchd  2018/6/19.
 */
public class CommandQueue {
    /**
     * 定义一个ArrayList来存储命令队列
     */
    private ArrayList<AbstractCommand> commands = new ArrayList<AbstractCommand>();

    public void addCommand(AbstractCommand command) {
        commands.add(command);
    }

    public void removeCommand(AbstractCommand command) {
        commands.remove(command);
    }

    /**
     * 循环调用每一个命令对象的execute()方法
     * 如果请求接收者的接收次序没有严格的先后次序，我们还可以使用多线程技术来并发调用命令对象的execute()方法，从而提高程序的执行效率
     */
    public void execute() {
        for (Object command : commands) {
            ((AbstractCommand) command).execute();
        }
    }
}
