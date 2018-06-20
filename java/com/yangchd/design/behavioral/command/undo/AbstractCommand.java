package com.yangchd.design.behavioral.command.undo;

/**
 * @author yangchd  2018/6/19.
 * 抽象命令类
 */
public abstract class AbstractCommand {
    /**
     * 声明命令执行方法execute()
     *
     * @param value 值
     * @return  结果
     */
    public abstract int execute(int value);

    /**
     * 声明撤销方法undo()
     *
     * @return  回滚结果
     */
    public abstract int undo();
}
