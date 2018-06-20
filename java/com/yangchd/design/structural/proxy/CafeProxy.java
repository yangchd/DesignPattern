package com.yangchd.design.structural.proxy;

/**
 * @author yangchd  2018/3/20.
 */
public class CafeProxy implements Cafe{

    private ConcreteCafe concreteCafe;

    public CafeProxy() {
        this.concreteCafe = new ConcreteCafe();
    }

    @Override
    public void getCafe() {
        concreteCafe.getCafe();
        addMilk();
        addSugar();
    }

    private void addMilk() {
        System.out.println("加奶！");
    }

    private void addSugar() {
        System.out.println("加糖！");
    }

}
