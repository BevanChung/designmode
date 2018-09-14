package com.zbf.protoTypeMode;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/11 14:23
 * @version 1.0
 */
public class WorkExperience implements Cloneable{

    private String timeArea;
    private String company;

    public String getTimeArea() {
        return timeArea;
    }

    public void setTimeArea(String timeArea) {
        this.timeArea = timeArea;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Object clone(){
        WorkExperience workExperience = null;
        try {
            workExperience =(WorkExperience) super.clone();
        }catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        return workExperience;
    }
}
