package com.zbf.stateMode;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/12 11:30
 * @version 1.0
 */
public class ConcreteStateB extends State {
    @Override
    public void handle(Context context) {
        System.out.println("状态改变为：B");
        context.setState(new ConcreteStateA());
    }
}
