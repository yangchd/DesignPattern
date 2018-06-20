package com.yangchd.design.structural.composite;

/**
 * @author yangchd  2018/3/19.
 */
public class Tree {
  
    TreeNode root = null;  
  
    public Tree(String name) {  
        root = new TreeNode(name);  
    }  
  
}