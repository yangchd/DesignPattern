package com.yangchd.design.memento.demo;

import java.util.ArrayList;

/**
 * @author yangchd  2018/6/20.
 *
 * 象棋棋子备忘录管理类：负责人
 */
public class MementoCaretaker {

    /**
     * 定义一个集合来存储多个备忘录
     */
    private ArrayList<ChessmanMemento> mementoList = new ArrayList<>();

    public ChessmanMemento getMemento(int i) {
        return mementoList.get(i);
    }

    public void setMemento(ChessmanMemento memento) {
        mementoList.add(memento);
    }
}
