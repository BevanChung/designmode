package com.zbf.observerMode;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/11 16:44
 * @version 1.0
 */
public class ConcreteSubject implements Subject{

    //注意到这个List集合的泛型参数为Observer接口，设计原则：面向接口编程而不是面向实现编程
    private List<Observer> list;
    private String message;

    public ConcreteSubject() {
        list = new ArrayList<>();
    }

    @Override
    public void attach(Observer observer) {
        list.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer o:list) {
            o.update(message);
        }
    }

    public void setInfomation(String s){
        this.message = s;
        System.out.println("服务器更新消息:"+s);
        //通知观察者
        notifyObservers();
    }
}
