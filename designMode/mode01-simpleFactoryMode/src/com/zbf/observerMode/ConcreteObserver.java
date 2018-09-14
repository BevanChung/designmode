package com.zbf.observerMode;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/11 16:44
 * @version 1.0
 */
public class ConcreteObserver implements Observer {

    private String name;
    private String message;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        this.message = message;
        System.out.println(this.name+"收到消息："+this.message);
    }
}
