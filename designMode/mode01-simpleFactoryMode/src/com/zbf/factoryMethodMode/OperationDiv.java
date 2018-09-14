package com.zbf.factoryMethodMode;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/10 14:19
 * @version 1.0
 */
public class OperationDiv extends Operation {

    @Override
    public int getResult() {
        int result = 0;
        try {
            result = super.getNumberA() / super.getNumberB();
        }catch (Exception e){
            System.out.println("除数不能为0.");
        }
        return result;
    }
}
