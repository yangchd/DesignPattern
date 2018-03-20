package com.yangchd.exercise.design.adapter.interadapter;

/**
 * @author yangchd  2018/3/20.
 *
 * 接口的适配器模式
 * 当不希望实现一个接口中所有的方法时，可以创建一个抽象类Wrapper，实现所有方法，我们写别的类的时候，继承抽象类即可
 */
public class WrapperTest {

    public static void main(String[] args) {
        SourceAble source1 = new SourceSub1();
        SourceAble source2 = new SourceSub2();

        source1.method1();
        source1.method2();
        source2.method1();
        source2.method2();
    }
}
