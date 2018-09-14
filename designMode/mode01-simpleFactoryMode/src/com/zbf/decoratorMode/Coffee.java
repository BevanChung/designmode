package com.zbf.decoratorMode;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/11 9:05
 * @version 1.0
 */
public class Coffee extends Drink {

    public Coffee(){
        name = "咖啡";
    }
    @Override
    public double cost() {
        return 15;
    }
}
