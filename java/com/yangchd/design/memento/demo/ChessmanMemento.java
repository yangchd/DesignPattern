package com.yangchd.design.memento.demo;

/**
 * @author yangchd  2018/6/20.
 *
 * 象棋棋子备忘录类：备忘录
 *
 * 在设计备忘录类时需要考虑其封装性，除了Originator类，不允许其他类来调用备忘录类Memento的构造函数与相关方法
 * 如果不考虑封装性，允许其他类调用setState()等方法，将导致在备忘录中保存的历史状态发生改变，通过撤销操作所恢复的状态就不再是真实的历史状态，备忘录模式也就失去了本身的意义
 *
 * 在使用Java语言实现备忘录模式时，一般通过将Memento类与Originator类定义在同一个包(package)中来实现封装，在Java语言中可使用默认访问标识符来定义Memento类，即保证其包内可见。
 */
class ChessmanMemento {

    private String label;
    private int x;
    private int y;

    ChessmanMemento(String label, int x, int y) {
        this.label = label;
        this.x = x;
        this.y = y;
    }

    void setLabel(String label) {
        this.label = label;
    }

    void setX(int x) {
        this.x = x;
    }

    void setY(int y) {
        this.y = y;
    }

    String getLabel() {
        return (this.label);
    }

    int getX() {
        return (this.x);
    }

    int getY() {
        return (this.y);
    }
}
