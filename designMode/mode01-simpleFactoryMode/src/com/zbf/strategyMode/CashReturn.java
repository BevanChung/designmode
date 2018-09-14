package com.zbf.strategyMode;

/**
 * Description:返利收费类
 *
 * @author zbf
 * date: 2018/9/10 15:54
 * @version 1.0
 */
public class CashReturn extends CashSuper {

    private double moneyCondition;
    private double moneyReturn;

    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money) {
        double result = 0d;
        if(money > moneyCondition){
            result = money - Math.floor(money/moneyCondition) * moneyReturn;
        }
        return result;
    }
}
