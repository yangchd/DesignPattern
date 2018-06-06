package com.yangchd.design.bridge;

/**
 * @author yangchd  2018/3/20.
 */
public class MyBridge extends Bridge {
    @Override
    public void method(){
        getSource().method();  
    }  
}  