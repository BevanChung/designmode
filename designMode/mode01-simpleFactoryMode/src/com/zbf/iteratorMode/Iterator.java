package com.zbf.iteratorMode;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/13 14:38
 * @version 1.0
 */
public abstract class Iterator {

    public abstract Object first();

    public abstract Object next();

    public abstract boolean isDone();

    public abstract Object currentItem();
}
