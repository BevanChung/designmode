package com.zbf.interpreterMode;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/14 10:54
 * @version 1.0
 */
public class AdditionInterpreter extends OperatorInterpreter {

    public AdditionInterpreter(BaseInterpreter<Integer> exp1, BaseInterpreter<Integer> exp2) {
        super(exp1, exp2);
    }

    @Override
    public Integer interpret() {
        return exp1.interpret() + exp2.interpret();
    }
}
