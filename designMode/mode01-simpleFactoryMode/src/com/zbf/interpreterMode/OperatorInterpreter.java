package com.zbf.interpreterMode;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/14 10:53
 * @version 1.0
 */
public abstract class OperatorInterpreter extends BaseInterpreter<Integer> {

    protected BaseInterpreter<Integer> exp1;
    protected BaseInterpreter<Integer> exp2;

    public OperatorInterpreter(BaseInterpreter<Integer> exp1, BaseInterpreter<Integer> exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }
}
