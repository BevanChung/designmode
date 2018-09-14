package com.zbf.stateMode;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/12 11:30
 * @version 1.0
 */
public class ConcreteStateA extends State {
    @Override
    public void handle(Context context) {
        System.out.println("状态改变为：A");
        context.setState(new ConcreteStateB());
    }
}
