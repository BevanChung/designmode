package com.zbf.iteratorMode;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/13 14:40
 * @version 1.0
 */
public class ConcreteIterator extends Iterator {

    private ConcreteAggregate concreteAggregate;

    private int current = 0;

    public ConcreteIterator(ConcreteAggregate concreteAggregate) {
        this.concreteAggregate = concreteAggregate;
    }

    @Override
    public Object first() {
        return concreteAggregate.getObject(0);
    }

    @Override
    public Object next() {
        Object o = null;
        current++;
        if(current < concreteAggregate.count()){
            o = concreteAggregate.getObject(current);
        }
        return o;
    }

    @Override
    public boolean isDone() {
        return current >= concreteAggregate.count()?true:false;
    }

    @Override
    public Object currentItem() {
        return concreteAggregate.getObject(current);
    }
}
