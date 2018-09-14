package com.zbf.factoryMethodMode;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/10 14:19
 * @version 1.0
 */
public class OperationMult extends Operation {

    @Override
    public int getResult() {
        int result = 0;
        result = super.getNumberA() * super.getNumberB();
        return result;
    }
}
