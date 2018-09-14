package com.zbf.chainOfResponsibility;

import com.sun.xml.internal.ws.api.message.MessageWritable;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/13 17:45
 * @version 1.0
 */
public class Test {

    public static void main(String[] args) {
        CommonManager m1 = new CommonManager("aa经理");
        Majordomo m2 = new Majordomo("bb总监");
        GeneralManager m3 = new GeneralManager("cc总经理");

        m1.setSuperior(m2);
        m2.setSuperior(m3);

        RequestMes requestMes1 =new RequestMes();
        requestMes1.setRequestType("请假");
        requestMes1.setRequestContent("小新请假");
        requestMes1.setRequestNum(1);
        m1.requestApplication(requestMes1);

        RequestMes requestMes2 =new RequestMes();
        requestMes2.setRequestType("请假");
        requestMes2.setRequestContent("小新请假");
        requestMes2.setRequestNum(4);
        m1.requestApplication(requestMes2);

        RequestMes requestMes3 =new RequestMes();
        requestMes3.setRequestType("请假");
        requestMes3.setRequestContent("小新请假");
        requestMes3.setRequestNum(8);
        m1.requestApplication(requestMes3);

        RequestMes requestMes4 =new RequestMes();
        requestMes4.setRequestType("加薪");
        requestMes4.setRequestContent("小新加薪");
        requestMes4.setRequestNum(800);
        m1.requestApplication(requestMes4);

        RequestMes requestMes5 =new RequestMes();
        requestMes5.setRequestType("加薪");
        requestMes5.setRequestContent("小新加薪");
        requestMes5.setRequestNum(1800);
        m1.requestApplication(requestMes5);

    }
}
