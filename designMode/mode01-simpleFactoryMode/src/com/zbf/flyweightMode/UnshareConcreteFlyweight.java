package com.zbf.flyweightMode;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/14 10:03
 * @version 1.0
 */
public class UnshareConcreteFlyweight extends Flyweight {
    @Override
    public void operation(int extrinsicstate) {
        System.out.println("不共享的具体Flyweight："+extrinsicstate);
    }
}
