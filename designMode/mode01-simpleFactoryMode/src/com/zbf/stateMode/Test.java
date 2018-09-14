package com.zbf.stateMode;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/12 11:31
 * @version 1.0
 */
public class Test {

    public static void main(String[] args) {
        //设置初始状态为A
        Context context = new Context(new ConcreteStateA());
        context.request();
        context.request();
        context.request();
        context.request();
        context.request();
        context.request();
    }
}
