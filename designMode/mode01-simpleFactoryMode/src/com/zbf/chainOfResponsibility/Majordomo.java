package com.zbf.chainOfResponsibility;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/13 17:39
 * @version 1.0
 */
public class Majordomo extends Manager {

    public Majordomo(String name) {
        super(name);
    }

    @Override
    public void requestApplication(RequestMes requestMes) {
        if(requestMes.getRequestType().equals("请假") && requestMes.getRequestNum() < 5){
            System.out.println(name+"，您的"+requestMes.getRequestType()+"审批通过，请假天数为："+requestMes.getRequestNum()+" 批准人："+this.name);
        }else {
            if (null != superior){
                superior.requestApplication(requestMes);
            }
        }
    }
}
