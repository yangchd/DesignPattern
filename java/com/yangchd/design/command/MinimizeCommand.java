package com.yangchd.design.command;

/**
 * @author yangchd  2018/6/19.
 *
 * 最小化命令类：具体命令类
 */
public class MinimizeCommand extends AbstractCommand {
    /**
     * 维持对请求接收者的引用
     */
    private WindowHandler whObj;

    public MinimizeCommand() {
        whObj = new WindowHandler();
    }

    /**
     * 命令执行方法，将调用请求接收者的业务方法
     */
    @Override
    public void execute() {
        whObj.minimize();
    }
}
