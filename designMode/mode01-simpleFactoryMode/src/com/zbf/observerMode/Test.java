package com.zbf.observerMode;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/11 16:49
 * @version 1.0
 */
public class Test {

    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        Observer observer1 = new ConcreteObserver("aa");
        Observer observer2= new ConcreteObserver("bb");
        Observer observer3 = new ConcreteObserver("cc");
        concreteSubject.attach(observer1);
        concreteSubject.attach(observer2);
        concreteSubject.attach(observer3);
        concreteSubject.setInfomation("PHP是世界上最好的语言！");
    }
}
