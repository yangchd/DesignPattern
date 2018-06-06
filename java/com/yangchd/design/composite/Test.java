package com.yangchd.design.composite;

/**
 * @author yangchd  2018/3/20.
 *
 * 组合模式（Composite）
 * 有时又叫部分-整体模式在处理类似树形结构的问题时比较方便
 */
public class Test {
    public static void main(String[] args) {
        Tree tree = new Tree("A");
        TreeNode nodeB = new TreeNode("B");
        TreeNode nodeC = new TreeNode("C");

        nodeB.add(nodeC);
        tree.root.add(nodeB);
        System.out.println("build the tree finished!");
    }
}
