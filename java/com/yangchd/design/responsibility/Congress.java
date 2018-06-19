package com.yangchd.design.responsibility;

/**
 * @author yangchd  2018/6/19.
 *
 * 董事会类：具体处理者
 */
public class Congress extends AbstractApprover {
    public Congress(String name) {
        super(name);
    }

    /**
     * 具体请求处理方法
     *
     * @param request
     */
    @Override
    public void processRequest(PurchaseRequest request) {
        //处理请求
        System.out.println("召开董事会审批采购单：" + request.getNumber() + "，金额：" + request.getAmount() + "元，采购目的：" + request.getPurpose() + "。");
    }
}
