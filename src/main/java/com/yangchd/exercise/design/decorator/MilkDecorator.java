package com.yangchd.exercise.design.decorator;

/**
 * @author yangchd  2018/3/20.
 * 具体装饰角色
 */
public class MilkDecorator extends Decorator{

    public MilkDecorator(Cafe cafe) {
        super(cafe);
    }

    @Override
    public void getCafe() {
        super.getCafe();
        this.addMilk();
    }

    private void addMilk() {
        System.out.println("加奶！");
    }

}
