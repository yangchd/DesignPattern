package com.yangchd.design.responsibility;

/**
 * @author yangchd  2018/6/19.
 *
 * 主任类：具体处理者
 */
public class Director extends AbstractApprover {

    public Director(String name) {
        super(name);
    }

    /**
     * 具体请求处理方法
     *
     * @param request
     */
    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < 50000) {
            //处理请求
            System.out.println("主任" + this.name + "审批采购单：" + request.getNumber() + "，金额：" + request.getAmount() + "元，采购目的：" + request.getPurpose() + "。");
        } else {
            //转发请求
            this.successor.processRequest(request);
        }
    }
}
