package com.zbf.mediatorMode;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/14 9:23
 * @version 1.0
 */
public class ConcreteMediator extends Mediator {

    private ConcreteColleagueA concreteColleagueA;
    private ConcreteColleagueB concreteColleagueB;

    @Override
    public void send(String message, Colleague colleague) {
        if(colleague == concreteColleagueA){
            concreteColleagueB.notifyMessage(message);
        }else {
            concreteColleagueA.notifyMessage(message);
        }
    }

    public ConcreteColleagueA getConcreteColleagueA() {
        return concreteColleagueA;
    }

    public void setConcreteColleagueA(ConcreteColleagueA concreteColleagueA) {
        this.concreteColleagueA = concreteColleagueA;
    }

    public ConcreteColleagueB getConcreteColleagueB() {
        return concreteColleagueB;
    }

    public void setConcreteColleagueB(ConcreteColleagueB concreteColleagueB) {
        this.concreteColleagueB = concreteColleagueB;
    }
}
