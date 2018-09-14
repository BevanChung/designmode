package com.zbf.memtoMode;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/13 10:32
 * @version 1.0
 */
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
