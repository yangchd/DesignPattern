package com.yangchd.design.behavioral.command;

/**
 * @author yangchd  2018/6/19.
 *
 * 帮助命令类：具体命令类
 */
public class HelpCommand extends AbstractCommand {
    /**
     * 维持对请求接收者的引用
     */
    private HelpHandler hhObj;

    public HelpCommand() {
        hhObj = new HelpHandler();
    }

    /**
     * 命令执行方法，将调用请求接收者的业务方法
     */
    @Override
    public void execute() {
        hhObj.display();
    }
}
