package com.yangchd.exercise.design.decorator;

/**
 * @author yangchd  2018/3/20.
 *
 * 装饰模式
 * 就是给一个对象增加一些新的功能，而且是动态的
 * 要求装饰对象和被装饰对象实现同一个接口，装饰对象持有被装饰对象的实例
 */
public class DecoratorTest {

    public static void main(String[] args) {
        SourceAble source = new Source();
        SourceAble obj = new Decorator(source);
        obj.method();
    }
}
