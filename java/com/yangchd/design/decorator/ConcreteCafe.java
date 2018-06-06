package com.yangchd.design.decorator;

/**
 * @author yangchd  2018/3/20.
 * 具体构件角色
 */
public class ConcreteCafe implements Cafe{

    @Override
    public void getCafe() {
        System.out.println("上一杯原味咖啡！");
    }

}
