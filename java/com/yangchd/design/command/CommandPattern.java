package com.yangchd.design.command;

/**
 * @author yangchd  2018/6/19.
 *
 * 命令模式(Command Pattern)：
 * 将一个请求封装为一个对象，从而让我们可用不同的请求对客户进行参数化；
 * 对请求排队或者记录请求日志，以及支持可撤销的操作。
 * 命令模式是一种对象行为型模式，其别名为动作(Action)模式或事务(Transaction)模式。
 *
 * 命令模式的本质是对请求进行封装，一个请求对应于一个命令，将发出命令的责任和执行命令的责任分割开。
 * 命令模式允许请求的一方和接收的一方独立开来，使得请求的一方不必知道接收请求的一方的接口，更不必知道请求如何被接收、操作是否被执行、何时被执行，以及是怎么被执行的。
 * 命令模式的关键在于引入了抽象命令类，请求发送者针对抽象命令类编程，只有实现了抽象命令类的具体命令才与请求接收者相关联。
 *
 * 每一个具体命令类对应一个请求的处理者（接收者），通过向请求发送者注入不同的具体命令对象可以使得相同的发送者对应不同的接收者，从而实现“将一个请求封装为一个对象，用不同的请求对客户进行参数化”
 *
 * 1. 主要优点
 * (1) 降低系统的耦合度。由于请求者与接收者之间不存在直接引用，因此请求者与接收者之间实现完全解耦，相同的请求者可以对应不同的接收者，同样，相同的接收者也可以供不同的请求者使用，两者之间具有良好的独立性。
 * (2) 新的命令可以很容易地加入到系统中。由于增加新的具体命令类不会影响到其他类，因此增加新的具体命令类很容易，无须修改原有系统源代码，甚至客户类代码，满足“开闭原则”的要求。
 * (3) 可以比较容易地设计一个命令队列或宏命令（组合命令）。
 * (4) 为请求的撤销(Undo)和恢复(Redo)操作提供了一种设计和实现方案。
 * 2. 主要缺点
 * 使用命令模式可能会导致某些系统有过多的具体命令类。因为针对每一个对请求接收者的调用操作都需要设计一个具体命令类，因此在某些系统中可能需要提供大量的具体命令类，这将影响命令模式的使用。
 * 3. 适用场景
 * (1) 系统需要将请求调用者和请求接收者解耦，使得调用者和接收者不直接交互。请求调用者无须知道接收者的存在，也无须知道接收者是谁，接收者也无须关心何时被调用。
 * (2) 系统需要在不同的时间指定请求、将请求排队和执行请求。一个命令对象和请求的初始调用者可以有不同的生命期，换言之，最初的请求发出者可能已经不在了，而命令对象本身仍然是活动的，可以通过该命令对象去调用请求接收者，而无须关心请求调用者的存在性，可以通过请求日志文件等机制来具体实现。
 * (3) 系统需要支持命令的撤销(Undo)操作和恢复(Redo)操作。
 * (4) 系统需要将一组操作组合在一起形成宏命令。
 *
 */
public class CommandPattern {
    public static void main(String[] args) {
        FBSettingWindow fbsw = new FBSettingWindow("功能键设置");

        FunctionButton fb1,fb2;
        fb1 = new FunctionButton("功能键1");
        fb2 = new FunctionButton("功能键2");

        AbstractCommand command1,command2;
        command1 = new HelpCommand();
        command2 = new MinimizeCommand();

        //将命令对象注入功能键
        fb1.setCommand(command1);
        fb2.setCommand(command2);

        fbsw.addFunctionButton(fb1);
        fbsw.addFunctionButton(fb2);
        fbsw.display();

        //调用功能键的业务方法
        fb1.onClick();
        fb2.onClick();
    }
}