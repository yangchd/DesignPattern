package com.yangchd.design.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author yangchd  2018/5/7.
 *
 * 通过反射，破坏单例
 * 除此之外，还有序列化，克隆可以破坏单例
 */
public class SingletonBreak {

    /**
     * 通过反射，修改构造函数访问权限，然后生成一个新的实例，从而破坏单例
     */
    public static void main(String[] args) {
        try {
            SingletonLazyDoubleCheck instance1 = SingletonLazyDoubleCheck.getInstance();
            Class<?> clazz = Class.forName("com.yangchd.design.creational.singleton.SingletonLazyDoubleCheck");
            Constructor<?> constructor = clazz.getDeclaredConstructor();
            constructor.setAccessible(true);
            SingletonLazyDoubleCheck instance2 = (SingletonLazyDoubleCheck) constructor.newInstance();
            if(instance1 == instance2) {
                System.out.println("Singleton break failed!");
            }else {
                System.out.println("Singleton break succeed!");
            }
        } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
