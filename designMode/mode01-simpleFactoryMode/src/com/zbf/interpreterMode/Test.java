package com.zbf.interpreterMode;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/14 11:04
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        String testStr = "1_+_34_-_10_+_50";
        Calculator calculator = new Calculator(testStr);
        System.out.println("result="+calculator.calculate());
    }
}
