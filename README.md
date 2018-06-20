# Java 设计模式

### 一、分类
- 创建型模式：[工厂方法模式](java/com/yangchd/design/factory/factory/normalfactory)、[抽象工厂模式](java/com/yangchd/design/factory/factory/abstractfactory)、[单例模式](java/com/yangchd/design/singleton)、[建造者模式](java/com/yangchd/design/builder)、[原型模式](java/com/yangchd/design/prototype)。
- 结构型模式：[适配器模式](java/com/yangchd/design/adapter)、[装饰器模式](java/com/yangchd/design/decorator)、[代理模式](java/com/yangchd/design/proxy)、[外观模式](java/com/yangchd/design/facade)、[桥接模式](java/com/yangchd/design/bridge)、[组合模式](java/com/yangchd/design/composite)、[享元模式](java/com/yangchd/design/flyweight)。
- 行为型模式：[策略模式](java/com/yangchd/design/strategy)、[模板方法模式](java/com/yangchd/design/template)、[观察者模式](java/com/yangchd/design/observer)、[迭代器模式](java/com/yangchd/design/iterator)、[职责链模式](java/com/yangchd/design/responsibility)、[命令模式](java/com/yangchd/design/command)、[备忘录模式](java/com/yangchd/design/memento)、[状态模式](java/com/yangchd/design/state)、[访问者模式](java/com/yangchd/design/visitor)、[中介者模式](java/com/yangchd/design/mediator)、[解释器模式](java/com/yangchd/design/interpreter)。

### 二、原则
1. 开闭原则（Open Close Principle）  
开闭原则就是说对扩展开放，对修改关闭。在程序需要进行拓展的时候，不能去修改原有的代码，实现一个热插拔的效果。所以一句话概括就是：为了使程序的扩展性好，易于维护和升级。想要达到这样的效果，我们需要使用接口和抽象类，后面的具体设计中我们会提到这点。
1. 里氏代换原则（Liskov Substitution Principle）  
里氏代换原则(Liskov Substitution Principle LSP)面向对象设计的基本原则之一。 里氏代换原则中说，任何基类可以出现的地方，子类一定可以出现。 LSP是继承复用的基石，只有当衍生类可以替换掉基类，软件单位的功能不受到影响时，基类才能真正被复用，而衍生类也能够在基类的基础上增加新的行为。里氏代换原则是对“开-闭”原则的补充。实现“开-闭”原则的关键步骤就是抽象化。而基类与子类的继承关系就是抽象化的具体实现，所以里氏代换原则是对实现抽象化的具体步骤的规范。
1. 依赖倒转原则（Dependence Inversion Principle）  
这个是开闭原则的基础，具体内容：真对接口编程，依赖于抽象而不依赖于具体。
1. 接口隔离原则（Interface Segregation Principle）  
这个原则的意思是：使用多个隔离的接口，比使用单个接口要好。还是一个降低类之间的耦合度的意思，从这儿我们看出，其实设计模式就是一个软件的设计思想，从大型软件架构出发，为了升级和维护方便。所以上文中多次出现：降低依赖，降低耦合。
1. 迪米特法则（最少知道原则）（Demeter Principle）  
为什么叫最少知道原则，就是说：一个实体应当尽量少的与其他实体之间发生相互作用，使得系统功能模块相对独立。
1. 合成复用原则（Composite Reuse Principle）  
原则是尽量使用合成/聚合的方式，而不是使用继承。

<table>
    <tr>
        <td>类型</td><td>模式名称</td><td>学习难度</td><td>使用频率</td>
    </tr>
    <tr>
        <td rowspan="6">创建型模式<br/>Creational Pattern</td><td><a herf="https://www.baidu.com">单例模式Singleton Pattern</a></td><td>★☆☆☆☆</td><td>★★★★☆</td>
    </tr>
    <tr>
        <td>简单工厂模式<br/>Simple Factory Pattern</td><td>★★☆☆☆</td><td>★★★☆☆</td>
    </tr>
    <tr>
        <td>工厂方法模式<br/>Factory Method Pattern</td><td>★★☆☆☆</td><td>★★★★★</td>
    </tr>
    <tr>
        <td>抽象工厂模式<br/>Abstract  Factory Pattern</td><td>★★★★☆</td><td>★★★★★</td>
    </tr>
    <tr>
        <td>原型模式<br/>Prototype Pattern</td><td>★★★☆☆</td><td>★★★☆☆</td>
    </tr>
    <tr>
        <td>建造者模式<br/>Builder Pattern</td><td>★★★★☆</td><td>★★☆☆☆</td>
    </tr>
    <tr>
        <td rowspan="7">结构型模式Structural Pattern</td><td>适配器模式Adapter Pattern</td><td>★★☆☆☆</td><td>★★★★☆</td>
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
        <td rowspan="11">行为型模式Behavioral Pattern</td><td>职责链模式Chain  of Responsibility Pattern</td><td>★★★☆☆</td><td>★★☆☆☆</td>
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