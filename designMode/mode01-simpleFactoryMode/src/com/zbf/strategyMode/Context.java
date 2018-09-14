package com.zbf.strategyMode;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/10 16:18
 * @version 1.0
 */
public class Context {

    private CashSuper cashSuper;

    public Context(CashSuper cashSuper) {
        this.cashSuper = cashSuper;
    }

    public double getMoney(double money){
        return cashSuper.acceptCash(money);
    }
}
