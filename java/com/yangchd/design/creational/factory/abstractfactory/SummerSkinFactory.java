package com.yangchd.design.creational.factory.abstractfactory;

class SummerSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SummerButton();  
    }  
  
    @Override
    public TextField createTextField() {
        return new SummerTextField();  
    }  
  
}