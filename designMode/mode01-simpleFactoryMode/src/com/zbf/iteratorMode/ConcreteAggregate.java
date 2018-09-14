package com.zbf.iteratorMode;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/13 14:42
 * @version 1.0
 */
public class ConcreteAggregate extends Aggregate {

    private List<Object> list = new ArrayList<>();

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public int count(){
        return list.size();
    }

    public Object getObject(int index) {
        return list.get(index);
    }

    public void setObject(int index,Object o) {
        this.list.add(index,o);
    }
}
