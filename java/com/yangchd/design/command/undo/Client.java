package com.yangchd.design.command.undo;

/**
 * @author yangchd  2018/6/19.
 */
public class Client {
    public static void main(String args[]) {
        CalculatorForm form = new CalculatorForm();
        AbstractCommand command;
        command = new ConcreteCommand();
        //向发送者注入命令对象
        form.setCommand(command);

        form.compute(10);
        form.compute(5);
        form.compute(10);
        form.undo();
    }
}
