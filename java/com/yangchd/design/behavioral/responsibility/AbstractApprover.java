package com.yangchd.design.behavioral.responsibility;

/**
 * @author yangchd  2018/6/19.
 */
public abstract class AbstractApprover {
    /**
     * 定义后继对象
     */
    protected AbstractApprover successor;
    /**
     * 审批者姓名
     */
    protected String name;

    public AbstractApprover(String name) {
        this.name = name;
    }
    /**
     * 设置后继者
     * @param successor
     */
    public void setSuccessor(AbstractApprover successor) {
        this.successor = successor;
    }
    /**
     * 抽象请求处理方法
     * @param request
     */
    public abstract void processRequest(PurchaseRequest request);
}
