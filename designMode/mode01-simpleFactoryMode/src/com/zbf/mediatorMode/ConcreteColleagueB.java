package com.zbf.mediatorMode;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/14 9:22
 * @version 1.0
 */
public class ConcreteColleagueB extends Colleague {

    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
    }

    public void send(String message){
        mediator.send(message,this);
    }

    public void notifyMessage(String message){
        System.out.println("同事B收到的信息:"+message);
    }
}
