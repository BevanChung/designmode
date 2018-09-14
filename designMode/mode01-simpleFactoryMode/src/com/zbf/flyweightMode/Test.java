package com.zbf.flyweightMode;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/14 10:08
 * @version 1.0
 */
public class Test {

    public static void main(String[] args) {
        int extrinsicstate = 22;
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Flyweight a = flyweightFactory.getFlyweight("A");
        a.operation(--extrinsicstate);

        Flyweight b = flyweightFactory.getFlyweight("B");
        b.operation(--extrinsicstate);

        Flyweight c = flyweightFactory.getFlyweight("C");
        c.operation(--extrinsicstate);

        UnshareConcreteFlyweight uf = new UnshareConcreteFlyweight();
        uf.operation(--extrinsicstate);
        System.out.println(extrinsicstate);
    }
}
