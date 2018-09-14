package com.zbf.interpreterMode;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/14 10:52
 * @version 1.0
 */
public class NumberInterpreter extends BaseInterpreter<Integer> {

    private int num;

    public NumberInterpreter(int num) {
        this.num = num;
    }

    @Override
    public Integer interpret() {
        return this.num;
    }
}
