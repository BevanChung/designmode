package com.zbf.visitorMode;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/14 13:52
 * @version 1.0
 */
public class CPA implements AccountBookViewer {
    @Override
    public void view(ConsumeBill consumeBill) {
        if (consumeBill.getItem().equals("工资")){
            System.out.println("注会查看工资是否缴交个人所得税。");
        }
    }

    @Override
    public void view(IncomeBill incomeBill) {
        System.out.println("注会查看收入是否交税。");
    }
}
