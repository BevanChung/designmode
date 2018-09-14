package com.zbf.strategyMode;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/10 16:37
 * @version 1.0
 */
public class SimpleFactoryContext {
    CashSuper cashSuper = null;

    public SimpleFactoryContext(String type){
        switch (type){
            case "normal":
                cashSuper = new CashNormal();
                break;
            case "return":
                cashSuper = new CashReturn(300,100);
                break;
            case "rebate":
                cashSuper = new CashRebate(0.8);
                break;
        }
    }
    public double getResult(double money){
        return cashSuper.acceptCash(money);
    }
}
