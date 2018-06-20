package com.yangchd.design.behavioral.state.demo2;

/**
 * @author yangchd  2018/6/20.
 */
class OffState extends AbstractState {

    @Override
    public void on(Switch s) {
        System.out.println("打开！");  
        s.setState(Switch.getState("on"));  
    }  
      
    @Override
    public void off(Switch s) {
        System.out.println("已经关闭！");  
    }  
}