package com.zbf.bridgeMode;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/13 15:58
 * @version 1.0
 */
public class RefinedAbstration extends Abstration {

    @Override
    public void operation(){
        implementor.operation();
    }
}
