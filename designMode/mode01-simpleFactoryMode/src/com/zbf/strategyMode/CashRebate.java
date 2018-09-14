package com.zbf.strategyMode;

/**
 * Description:打折消费类
 *
 * @author zbf
 * date: 2018/9/10 15:51
 * @version 1.0
 */
public class CashRebate extends CashSuper {

    private double rebateRate = 1d;

    public CashRebate(double rebateRate) {
        this.rebateRate = rebateRate;
    }

    @Override
    public double acceptCash(double money) {
        return money*rebateRate;
    }
}
