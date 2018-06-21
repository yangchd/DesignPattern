package com.yangchd.design.creational.factory.abstractfactory;

class SpringTextField implements TextField {
    @Override
    public void display() {
        System.out.println("显示绿色边框文本框。");  
    }  
}  