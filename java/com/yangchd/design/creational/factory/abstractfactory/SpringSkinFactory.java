package com.yangchd.design.creational.factory.abstractfactory;

class SpringSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SpringButton();  
    }  
  
    @Override
    public TextField createTextField() {
        return new SpringTextField();  
    }  
  
}