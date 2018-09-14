package com.zbf.flyweightMode;

import java.util.Hashtable;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/14 10:05
 * @version 1.0
 */
public class FlyweightFactory {

    private Hashtable<String,Flyweight> flyweights = new Hashtable();

    public FlyweightFactory() {
        flyweights.put("A",new ConcreteFlyweight());
        flyweights.put("B",new ConcreteFlyweight());
        flyweights.put("C",new ConcreteFlyweight());
    }

    public Flyweight getFlyweight(String key){
        return flyweights.get(key);
    }
}
