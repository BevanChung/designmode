package com.zbf.decoratorMode;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/11 9:23
 * @version 1.0
 */
public class Sugar extends ExtraAddings {

    Drink drink;

    public Sugar(Drink drink){
        this.drink = drink;
    }
    @Override
    public String getDescription() {
        return drink.getDescription() + "+糖";
    }

    public double cost(){
        return 2 + drink.cost();
    }
}
