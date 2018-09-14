package com.zbf.strategyMode;

import java.lang.reflect.Constructor;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/10 17:12
 * @version 1.0
 */
public class FsContext {
    private static final String[] CUSH_CLASS_NAME = {
            "com.zbf.strategyMode.CashNormal",
            "com.zbf.strategyMode.CashRebate",
            "com.zbf.strategyMode.CashReturn"
    };
    CashSuper cashSuper = null;

    public FsContext(int type,Class[] paramsType, Object[] params){
        try {
            Class<?> clazz=Class.forName(CUSH_CLASS_NAME[type]);
            Constructor<?> constructor=clazz.getConstructor(paramsType);
            this.cashSuper=(CashSuper)constructor.newInstance(params);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public double getResult(double money){
        return cashSuper.acceptCash(money);
    }
}
