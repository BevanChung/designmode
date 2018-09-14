package com.zbf.protoTypeMode;


/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/11 14:00
 * @version 1.0
 */
public class Resume implements Cloneable {

    private String name;
    private int age;
    private String sex;

    private WorkExperience workExperience;

    public Resume(String name) {
        this.name = name;
        this.workExperience = new WorkExperience();
    }

    private Resume(WorkExperience workExperience){
        this.workExperience = (WorkExperience) workExperience.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 设置个人信息
     * @param sex
     * @param age
     */
    public void setPersonInfo(String sex,int age){
        this.sex = sex;
        this.age = age;
    }

    /**
     * 设置工作经历
     * @param timeArea
     * @param company
     */
    public void setWorkExperience(String timeArea,String company){
        this.workExperience.setTimeArea(timeArea);;
        this.workExperience.setCompany(company);
    }

    public void display(){
        System.out.println(this.name + ","+this.sex+","+this.age);
        System.out.println(workExperience.getTimeArea()+","+workExperience.getCompany());
    }

    public Object clone(){
        Resume resume = new Resume(this.workExperience);
        resume.setPersonInfo(this.sex,this.age);
        resume.setName(this.name);
        return resume;
    }
}
