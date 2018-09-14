package com.zbf.decoratorMode;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/11 8:58
 * @version 1.0
 */
public abstract class Drink {
    public String name;

    public String getDescription(){
        return name;
    }

    public abstract double cost();
}
