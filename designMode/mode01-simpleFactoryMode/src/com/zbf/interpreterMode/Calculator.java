package com.zbf.interpreterMode;

import java.util.Stack;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/14 10:58
 * @version 1.0
 */
public class Calculator {

    private Stack<BaseInterpreter<Integer>> mExpStack = new Stack<>();

    public Calculator(String expression){
        // 声明两个BaseInterpreter<Integer>的临时变量,因为计算必须要记录两个数
        BaseInterpreter<Integer> exp1,exp2;

        //  以符号_分隔，这是我们自己规定的
        String[] exps = expression.split("_");

        for(int i=0;i<exps.length;i++){
            switch (exps[i].charAt(0)) {
                case '+': // 加法
                    exp1 = mExpStack.pop();
                    exp2 = new NumberInterpreter(Integer.valueOf(exps[++i]));
                    mExpStack.push(new AdditionInterpreter(exp1, exp2));
                    break;
                case '-':
                    exp1 = mExpStack.pop();
                    exp2 = new NumberInterpreter(Integer.valueOf(exps[++i]));
                    mExpStack.push(new SubtractionInterpreter(exp1, exp2));
                    break;
                default: // 数字
                    mExpStack.push(new NumberInterpreter(Integer.valueOf(exps[i])));
                    break;
            }
        }
    }

    /**
     * 计算
     * @return
     */
    public int calculate(){
        return mExpStack.pop().interpret();
    }
}
