package com.zbf.factoryMethodMode;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/11 11:25
 * @version 1.0
 */
public class DivFactory implements IFactory{
    @Override
    public Operation createOperation() {
        return new OperationDiv();
    }
}
