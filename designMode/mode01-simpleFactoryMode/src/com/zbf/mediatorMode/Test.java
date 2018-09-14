package com.zbf.mediatorMode;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/14 9:30
 * @version 1.0
 */
public class Test {

    public static void main(String[] args) {
        ConcreteMediator concreteMediator = new ConcreteMediator();
        ConcreteColleagueA concreteColleagueA = new ConcreteColleagueA(concreteMediator);
        ConcreteColleagueB concreteColleagueB = new ConcreteColleagueB(concreteMediator);

        concreteMediator.setConcreteColleagueA(concreteColleagueA);
        concreteMediator.setConcreteColleagueB(concreteColleagueB);

        concreteColleagueA.send("吃饭了吗？");
        concreteColleagueB.send("没有呢，你要请客吗？");
    }
}
