package com.zbf.mediatorMode;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/14 9:19
 * @version 1.0
 */
public class ConcreteColleagueA extends Colleague {

    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
    }

    public void send(String message){
        mediator.send(message,this);
    }

    public void notifyMessage(String message){
        System.out.println("同事A收到信息:"+message);
    }
}
