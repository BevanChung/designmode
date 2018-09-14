package com.zbf.factoryMethodMode;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/10 14:28
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        IFactory iFactory = new AddFactory();
        Operation operation = iFactory.createOperation();
        operation.setNumberA(10);
        operation.setNumberB(5);
        double result = operation.getResult();
        System.out.println(result);
    }
}
