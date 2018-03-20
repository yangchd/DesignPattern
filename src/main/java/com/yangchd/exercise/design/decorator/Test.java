package com.yangchd.exercise.design.decorator;

/**
 * @author yangchd  2018/3/20.
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
