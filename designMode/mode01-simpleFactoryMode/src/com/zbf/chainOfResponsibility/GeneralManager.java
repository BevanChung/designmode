package com.zbf.chainOfResponsibility;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/13 17:41
 * @version 1.0
 */
public class GeneralManager extends Manager {

    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void requestApplication(RequestMes requestMes) {
        if(requestMes.getRequestType().equals("请假") && requestMes.getRequestNum() < 10){
            System.out.println(name+"，您的"+requestMes.getRequestType()+"审批通过，请假天数为："+requestMes.getRequestNum()+" 批准人："+this.name);
        }else if(requestMes.getRequestType().equals("加薪") && requestMes.getRequestNum() < 1000){
            System.out.println(name+"，您的"+requestMes.getRequestType()+"审批通过，加薪数量为："+requestMes.getRequestNum()+" 批准人："+this.name);
        }
        else {
            System.out.println("拒绝请求！拒绝人：总经理。");
        }
    }
}
