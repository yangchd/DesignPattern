package com.yangchd.design.bridge;

/**
 * @author yangchd  2018/3/20.
 */
public abstract class Bridge {
    private SourceAble source;

    public void method(){
        source.method();
    }

    public SourceAble getSource() {
        return source;
    }

    public void setSource(SourceAble source) {
        this.source = source;
    }
}