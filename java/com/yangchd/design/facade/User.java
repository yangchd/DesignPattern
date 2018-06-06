package com.yangchd.design.facade;

/**
 * @author yangchd  2018/3/20.
 *
 * 外观模式（Facade）
 * 外观模式就是将他们的关系放在一个Facade类中，降低了类类之间的耦合度
 */
public class User {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startup();
        computer.shutdown();
    }
}
