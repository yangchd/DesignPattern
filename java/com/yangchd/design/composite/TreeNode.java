package com.yangchd.design.composite;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author yangchd  2018/3/19.
 */
public class TreeNode {
      
    private String name;  
    private TreeNode parent;  
    private Vector<TreeNode> children = new Vector<TreeNode>();
      
    public TreeNode(String name){  
        this.name = name;  
    }  
  
    public String getName() {  
        return name;  
    }  
  
    public void setName(String name) {  
        this.name = name;  
    }  
  
    public TreeNode getParent() {  
        return parent;  
    }  
  
    public void setParent(TreeNode parent) {  
        this.parent = parent;  
    }  
      
    public void add(TreeNode node){
        children.add(node);  
    }  
      
    public void remove(TreeNode node){
        children.remove(node);  
    }  
      
    public Enumeration<TreeNode> getChildren(){
        return children.elements();  
    }  
} 