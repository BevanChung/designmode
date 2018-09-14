package com.zbf.interpreterMode;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/14 10:51
 * @version 1.0
 */
public abstract class BaseInterpreter<T> {

    /**
     * 抽象解释方法
     * @return
     */
    public abstract T interpret();
}
