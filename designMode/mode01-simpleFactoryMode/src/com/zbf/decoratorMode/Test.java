package com.zbf.decoratorMode;

import com.sun.org.apache.bcel.internal.generic.DREM;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/11 9:26
 * @version 1.0
 */
public class Test {

    public static void main(String[] args) {
        Drink drink1 = new Coffee();
        Drink drink2 = new Tea();
        Drink addMilk = new Milk(drink1);
        Drink addSugar = new Sugar(drink1);
        Drink addMilk2 = new Milk(drink2);
        Drink addSugar2 = new Sugar(drink2);
        Drink addAll1 = new Milk(addSugar);
        Drink addAll2 = new Sugar(addMilk2);
        System.out.println(addMilk.getDescription()+addMilk.cost());
        System.out.println(addSugar.getDescription()+addSugar.cost());
        System.out.println(addMilk2.getDescription()+addMilk2.cost());
        System.out.println(addSugar2.getDescription()+addSugar2.cost());
        System.out.println(addAll1.getDescription()+addAll1.cost());
        System.out.println(addAll2.getDescription()+addAll2.cost());
    }
}
