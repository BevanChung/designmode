package com.zbf.iteratorMode;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/13 14:57
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        ConcreteAggregate concreteAggregate = new ConcreteAggregate();
        concreteAggregate.createIterator();
        concreteAggregate.setObject(0,"张三");
        concreteAggregate.setObject(1,"李四");
        concreteAggregate.setObject(2,"王五");

        Iterator iterator = new ConcreteIterator(concreteAggregate);
        Object o = iterator.first();
        while (!iterator.isDone()){
            System.out.println(iterator.currentItem()+"：请买车票！");
            iterator.next();
        }
    }
}
