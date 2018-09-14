package com.zbf.memtoMode;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/13 10:32
 * @version 1.0
 */
public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemto(){
        return new Memento(state);
    }

    public void setMemento(Memento memento){
        state = memento.getState();
    }

    public void show(){
        System.out.println("当前状态是："+state);
    }
}
