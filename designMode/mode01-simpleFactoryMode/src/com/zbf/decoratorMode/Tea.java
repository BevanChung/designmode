package com.zbf.decoratorMode;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/11 9:05
 * @version 1.0
 */
public class Tea extends Drink {

    public Tea(){
        name = "茶";
    }
    @Override
    public double cost() {
        return 20;
    }
}
