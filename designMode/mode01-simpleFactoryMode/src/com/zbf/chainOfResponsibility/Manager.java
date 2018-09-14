package com.zbf.chainOfResponsibility;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/13 17:27
 * @version 1.0
 */
public abstract class Manager {

    protected String name;

    //管理者的上级
    protected Manager superior;

    public Manager(String name) {
        this.name = name;
    }
    //设置上级
    public void setSuperior(Manager superior) {
        this.superior = superior;
    }

    //申请请求
    public abstract void requestApplication(RequestMes requestMes);
}
