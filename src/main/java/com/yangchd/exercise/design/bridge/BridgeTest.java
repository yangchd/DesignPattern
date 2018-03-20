package com.yangchd.exercise.design.bridge;

/**
 * @author yangchd  2018/3/20.
 *
 * 桥接模式（Bridge）
 * 桥接模式就是把事物和其具体实现分开，使他们可以各自独立的变化。
 * 桥接的用意是：将抽象化与实现化解耦，使得二者可以独立变化，像我们常用的JDBC桥DriverManager一样
 */
public class BridgeTest {
      
    public static void main(String[] args) {  
          
        Bridge bridge = new MyBridge();  
          
        /*调用第一个对象*/  
        SourceAble source1 = new SourceSub1();
        bridge.setSource(source1);  
        bridge.method();  
          
        /*调用第二个对象*/
        SourceAble source2 = new SourceSub2();
        bridge.setSource(source2);  
        bridge.method();  
    }  
} 