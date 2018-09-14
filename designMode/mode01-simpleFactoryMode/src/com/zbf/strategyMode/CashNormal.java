package com.zbf.strategyMode;

/**
 * Description:正常收费类
 *
 * @author zbf
 * date: 2018/9/10 15:50
 * @version 1.0
 */
public class CashNormal extends CashSuper {
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
