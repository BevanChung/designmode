package com.zbf.chainOfResponsibility;


/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/13 17:30
 * @version 1.0
 */
public class RequestMes {

    private String requestType;

    private String requestContent;

    private int requestNum;

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getRequestContent() {
        return requestContent;
    }

    public void setRequestContent(String requestContent) {
        this.requestContent = requestContent;
    }

    public int getRequestNum() {
        return requestNum;
    }

    public void setRequestNum(int requestNum) {
        this.requestNum = requestNum;
    }
}
