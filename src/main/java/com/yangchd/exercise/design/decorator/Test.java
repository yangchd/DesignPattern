package com.yangchd.exercise.design.decorator;

/**
 * @author yangchd  2018/3/20.
 *
 * 装饰模式
 * 在不改变接口的前提下，动态扩展对象的访问。
 * 动态继承，让类具有在运行期改变行为的能力。
 * 装饰模式，突出的是运行期增加行为，这和继承是不同的，继承是在编译期增加行为。
 */
public class Test {

    public static void main(String[] args) {

        Cafe cafe = new ConcreteCafe();

        Cafe milkCafe = new MilkDecorator(cafe);
        milkCafe.getCafe();
        System.out.println("----------------------------------------");

        Cafe sugarCafe = new SugarDecorator(cafe);
        sugarCafe.getCafe();
        System.out.println("----------------------------------------");

        Cafe sugarMilkCafe = new MilkDecorator(new SugarDecorator(new ConcreteCafe()));
        sugarMilkCafe.getCafe();
        System.out.println("----------------------------------------");

        Cafe milkSugarCafe = new SugarDecorator(new MilkDecorator(cafe));
        milkSugarCafe.getCafe();
        System.out.println("----------------------------------------");

    }

}
