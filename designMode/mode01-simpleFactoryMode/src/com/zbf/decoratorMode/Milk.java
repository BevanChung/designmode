package com.zbf.decoratorMode;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/11 9:06
 * @version 1.0
 */
public class Milk extends ExtraAddings {

    Drink drink;

    public Milk(Drink drink){
        this.drink = drink;
    }
    @Override
    public String getDescription() {
        return drink.getDescription()+"+牛奶";
    }

    public double cost(){
        return 3+drink.cost();
    }
}
