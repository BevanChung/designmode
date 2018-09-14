package com.zbf.mediatorMode;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/14 9:16
 * @version 1.0
 */
public abstract class Mediator {

    public abstract void send(String message,Colleague colleague);

}
