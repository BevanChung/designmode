package com.zbf.observerMode;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/11 16:36
 * @version 1.0
 */
public interface Subject {


    /**
     * 增加观察者
     * @param observer
     */
    public void attach(Observer observer);

    /**
     * 移除观察者
     * @param observer
     */
    public void detach(Observer observer);

    /**
     * 通知
     */
    public void notifyObservers();
}
