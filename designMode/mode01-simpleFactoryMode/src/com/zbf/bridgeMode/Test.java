package com.zbf.bridgeMode;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/13 16:01
 * @version 1.0
 */
public class Test {

    public static void main(String[] args) {
        Abstration abstration = new RefinedAbstration();
        abstration.setImplementor(new ConcreteImplementorA());
        abstration.operation();

        abstration.setImplementor(new ConcreteImplementorB());
        abstration.operation();
    }
}
