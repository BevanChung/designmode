package com.zbf.simpleFactoryMode;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/10 14:28
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Operation oper = OperationFactory.createOperate("+");
        oper.setNumberA(50);
        oper.setNumberB(10);
        System.out.println(oper.getResult());
    }
}
