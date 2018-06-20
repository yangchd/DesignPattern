# Java 设计模式

### 一、面向对象设计原则
&emsp;&emsp;对于面向对象软件系统的设计而言，在支持可维护性的同时，提高系统的可复用性是一个至关重要的问题，如何同时提高一个软件系统的可维护性和可复用性是面向对象设计需要解决的核心问题之一。在面向对象设计中，可维护性的复用是以设计原则为基础的。每一个原则都蕴含一些面向对象设计的思想，可以从不同的角度提升一个软件结构的设计水平。  
&emsp;&emsp;面向对象设计原则为支持可维护性复用而诞生，这些原则蕴含在很多设计模式中，它们是从许多设计方案中总结出的指导性原则。面向对象设计原则也是我们用于评价一个设计模式的使用效果的重要指标之一，在设计模式的学习中，大家经常会看到诸如“XXX模式符合XXX原则”、“XXX模式违反了XXX原则”这样的语句。

&emsp;&emsp;最常见的7种面向对象设计原则如下表所示：  

| 设计原则名称 | 定  义 | 使用频率 |
|:---:|:---|:---:|
| 单一职责原则(Single Responsibility Principle, SRP) | 一个类只负责一个功能领域中的相应职责 | ★★★★☆ |
| 开闭原则(Open-Closed Principle, OCP) | 软件实体应对扩展开放，而对修改关闭 | ★★★★★ |
| 里氏代换原则(Liskov Substitution Principle, LSP) | 所有引用基类对象的地方能够透明地使用其子类的对象 | ★★★★★ |
| 依赖倒转原则(Dependence  Inversion Principle, DIP) | 抽象不应该依赖于细节，细节应该依赖于抽象 | ★★★★★ |
| 接口隔离原则(Interface Segregation Principle, ISP) | 使用多个专门的接口，而不使用单一的总接口 | ★★☆☆☆ |
| 合成复用原则(Composite Reuse Principle, CRP) | 尽量使用对象组合，而不是继承来达到复用的目的 | ★★★★☆ |
| 迪米特法则(Law of Demeter, LoD) | 一个软件实体应当尽可能少地与其他实体发生相互作用 | ★★★☆☆ |


### 二、分类
- 创建型模式：[工厂方法模式](java/com/yangchd/design/factory/factory/normalfactory)、[抽象工厂模式](java/com/yangchd/design/factory/factory/abstractfactory)、[单例模式](java/com/yangchd/design/singleton)、[建造者模式](java/com/yangchd/design/builder)、[原型模式](java/com/yangchd/design/prototype)。
- 结构型模式：[适配器模式](java/com/yangchd/design/adapter)、[装饰器模式](java/com/yangchd/design/decorator)、[代理模式](java/com/yangchd/design/proxy)、[外观模式](java/com/yangchd/design/facade)、[桥接模式](java/com/yangchd/design/bridge)、[组合模式](java/com/yangchd/design/composite)、[享元模式](java/com/yangchd/design/flyweight)。
- 行为型模式：[策略模式](java/com/yangchd/design/strategy)、[模板方法模式](java/com/yangchd/design/template)、[观察者模式](java/com/yangchd/design/observer)、[迭代器模式](java/com/yangchd/design/iterator)、[职责链模式](java/com/yangchd/design/responsibility)、[命令模式](java/com/yangchd/design/command)、[备忘录模式](java/com/yangchd/design/memento)、[状态模式](java/com/yangchd/design/state)、[访问者模式](java/com/yangchd/design/visitor)、[中介者模式](java/com/yangchd/design/mediator)、[解释器模式](java/com/yangchd/design/interpreter)。


<table>
    <tr>
        <td>类型</td><td>模式名称</td><td>学习难度</td><td>使用频率</td>
    </tr>
    <tr>
        <td rowspan="6">创建型模式<br/>Creational Pattern</td><td>单例模式Singleton Pattern</td><td>★☆☆☆☆</td><td>★★★★☆</td>
    </tr>
    <tr>
        <td>简单工厂模式Simple Factory Pattern</td><td>★★☆☆☆</td><td>★★★☆☆</td>
    </tr>
    <tr>
        <td>工厂方法模式Factory Method Pattern</td><td>★★☆☆☆</td><td>★★★★★</td>
    </tr>
    <tr>
        <td>抽象工厂模式Abstract  Factory Pattern</td><td>★★★★☆</td><td>★★★★★</td>
    </tr>
    <tr>
        <td>原型模式Prototype Pattern</td><td>★★★☆☆</td><td>★★★☆☆</td>
    </tr>
    <tr>
        <td>建造者模式Builder Pattern</td><td>★★★★☆</td><td>★★☆☆☆</td>
    </tr>
    <tr>
        <td rowspan="7">结构型模式<br/>Structural Pattern</td><td>适配器模式Adapter Pattern</td><td>★★☆☆☆</td><td>★★★★☆</td>
    </tr>
    <tr>
        <td>桥接模式Bridge  Pattern</td><td>★★★☆☆</td><td>★★★☆☆</td>
    </tr>
    <tr>
        <td>组合模式Composite  Pattern</td><td>★★★☆☆</td><td>★★★★☆</td>
    </tr>
    <tr>
        <td>装饰模式Decorator  Pattern</td><td>★★★☆☆</td><td>★★★☆☆</td>
    </tr>
    <tr>
        <td>外观模式Facade  Pattern</td><td>★☆☆☆☆</td><td>★★★★★</td>
    </tr>
    <tr>
        <td>享元模式Flyweight  Pattern</td><td>★★★★☆</td><td>★☆☆☆☆</td>
    </tr>
    <tr>
        <td>代理模式Proxy  Pattern</td><td>★★★☆☆</td><td>★★★★☆</td>
    </tr>
    <tr>
        <td rowspan="11">行为型模式<br/>Behavioral Pattern</td><td>职责链模式Chain  of Responsibility Pattern</td><td>★★★☆☆</td><td>★★☆☆☆</td>
    </tr>
    <tr>
        <td>命令模式Command  Pattern</td><td>★★★☆☆</td><td>★★★★☆</td>
    </tr>
    <tr>
        <td>解释器模式Interpreter  Pattern</td><td>★★★★★</td><td>★☆☆☆☆</td>
    </tr>
    <tr>
        <td>迭代器模式Iterator  Pattern</td><td>★★★☆☆</td><td>★★★★★</td>
    </tr>
    <tr>
        <td>中介者模式Mediator  Pattern</td><td>★★★☆☆</td><td>★★☆☆☆</td>
    </tr>
    <tr>
        <td>备忘录模式Memento  Pattern</td><td>★★☆☆☆</td><td>★★☆☆☆</td>
    </tr>
    <tr>
        <td>观察者模式Observer  Pattern</td><td>★★★☆☆</td><td>★★★★★</td>
    </tr>
    <tr>
        <td>状态模式State  Pattern</td><td>★★★☆☆</td><td>★★★☆☆</td>
    </tr>
    <tr>
        <td>策略模式Strategy  Pattern</td><td>★☆☆☆☆</td><td>★★★★☆</td>
    </tr>
    <tr>
        <td>模板方法模式Template  Method Pattern</td><td>★★☆☆☆</td><td>★★★☆☆</td>
    </tr>
    <tr>
        <td>访问者模式Visitor  Pattern</td><td>★★★★☆</td><td>★☆☆☆☆</td>
    </tr>
</table>