package com.zbf.flyweightMode;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/14 10:02
 * @version 1.0
 */
public class ConcreteFlyweight extends Flyweight {
    @Override
    public void operation(int extrinsicstate) {
        System.out.println("具体Flyweight："+extrinsicstate);
    }
}
