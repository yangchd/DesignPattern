package com.yangchd.design.behavioral.state;

import com.yangchd.design.behavioral.state.demo1.Account;
import com.yangchd.design.behavioral.state.demo2.Switch;

/**
 * @author yangchd  2018/6/20.
 *
 * 状态模式(State Pattern)：
 * 允许一个对象在其内部状态改变时改变它的行为，对象看起来似乎修改了它的类。
 * 其别名为状态对象(Objects for States)，状态模式是一种对象行为型模式。
 *
 * 在实际开发中，状态模式具有较高的使用频率，在工作流和游戏开发中状态模式都得到了广泛的应用，例如公文状态的转换、游戏中角色的升级等
 *
 * Context（环境类）：环境类又称为上下文类，它是拥有多种状态的对象。由于环境类的状态存在多样性且在不同状态下对象的行为有所不同，因此将状态独立出去形成单独的状态类。在环境类中维护一个抽象状态类State的实例，这个实例定义当前状态，在具体实现时，它是一个State子类的对象。
 * State（抽象状态类）：它用于定义一个接口以封装与环境类的一个特定状态相关的行为，在抽象状态类中声明了各种不同状态对应的方法，而在其子类中实现类这些方法，由于不同状态下对象的行为可能不同，因此在不同子类中方法的实现可能存在不同，相同的方法可以写在抽象状态类中。
 * ConcreteState（具体状态类）：它是抽象状态类的子类，每一个子类实现一个与环境类的一个状态相关的行为，每一个具体状态类对应环境的一个具体状态，不同的具体状态类其行为有所不同。
 *
 * 1. 主要优点
 * (1) 封装了状态的转换规则，在状态模式中可以将状态的转换代码封装在环境类或者具体状态类中，可以对状态转换代码进行集中管理，而不是分散在一个个业务方法中。
 * (2) 将所有与某个状态有关的行为放到一个类中，只需要注入一个不同的状态对象即可使环境对象拥有不同的行为。
 * (3) 允许状态转换逻辑与状态对象合成一体，而不是提供一个巨大的条件语句块，状态模式可以让我们避免使用庞大的条件语句来将业务方法和状态转换代码交织在一起。
 * (4) 可以让多个环境对象共享一个状态对象，从而减少系统中对象的个数。
 * 2. 主要缺点
 * (1) 状态模式的使用必然会增加系统中类和对象的个数，导致系统运行开销增大。
 * (2) 状态模式的结构与实现都较为复杂，如果使用不当将导致程序结构和代码的混乱，增加系统设计的难度。
 * (3) 状态模式对“开闭原则”的支持并不太好，增加新的状态类需要修改那些负责状态转换的源代码，否则无法转换到新增状态；而且修改某个状态类的行为也需修改对应类的源代码。
 * 3. 适用场景
 * (1) 对象的行为依赖于它的状态（如某些属性值），状态的改变将导致行为的变化。
 * (2) 在代码中包含大量与对象状态有关的条件语句，这些条件语句的出现，会导致代码的可维护性和灵活性变差，不能方便地增加和删除状态，并且导致客户类与类库之间的耦合增强。
 *
 */
public class StatePattern {
    public static void main(String args[]) {

        // demo1
        Account acc = new Account("yangchd",0.0);
        acc.deposit(1000);
        acc.withdraw(2000);
        acc.deposit(3000);
        acc.withdraw(4000);
        acc.withdraw(1000);
        acc.computeInterest();

        // demo2
        Switch s1,s2;
        s1=new Switch("开关1");
        s2=new Switch("开关2");
        s1.on();
        s2.on();
        s1.off();
        s2.off();
        s2.on();
        s1.on();
    }
}
