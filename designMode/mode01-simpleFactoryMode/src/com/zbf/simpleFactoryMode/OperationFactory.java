package com.zbf.simpleFactoryMode;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/10 14:12
 * @version 1.0
 */
public class OperationFactory {

    public static Operation createOperate(String operateType){
        Operation operation = null;
        switch (operateType){
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMult();
                break;
            case "/":
                operation = new OperationDiv();
                break;
        }
        return operation;
    }
}
