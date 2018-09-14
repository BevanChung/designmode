package com.zbf.proxyMode;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/11 10:37
 * @version 1.0
 */
public class Test {

    public static void main(String[] args) {
        SchoolGirl sg = new SchoolGirl();
        sg.setName("娇娇");

        Proxy proxy = new Proxy(sg);
        proxy.giveDolls();
        proxy.giveFlowers();
        proxy.giveChocolate();
    }
}
