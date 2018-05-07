package com.yangchd.exercise.design.singleton;

/**
 * @author yangchd  2018/5/7.
 *
 * 枚举方式实现单例
 *
 * 由于创建枚举实例的过程是线程安全的，所以这种写法也没有同步的问题。
 * 这种写法在功能上与共有域方法相近，但是它更简洁，无偿地提供了序列化机制，绝对防止对此实例化，即使是在面对复杂的序列化或者反射攻击的时候。
 * 虽然这中方法还没有广泛采用，但是单元素的枚举类型已经成为实现Singleton的最佳方法。
 *
 * 但是它仍然不是完美的——比如，在需要继承的场景，它就不适用了。
 */
public enum SingletonEnum {

    /**
     * 通过枚举的方法，声明一个单例
     */
    SINGLETON_ENUM;

    public void func(){
        // 这里实现单例需要的方法
        System.out.println("Hello I'm enum");
    }
}
