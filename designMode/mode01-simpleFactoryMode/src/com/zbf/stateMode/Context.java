package com.zbf.stateMode;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/12 11:25
 * @version 1.0
 */
public class Context {

    private State state;

    /**
     * 定义初始状态
     * @param state
     */
    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    /**
     * 对请求作处理，并设置下一个状态
     */
    public void request(){
        state.handle(this);
    }
}

