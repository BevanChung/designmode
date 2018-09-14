package com.zbf.protoTypeMode;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/11 14:08
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Resume resume1 = new Resume("aa");
        resume1.setPersonInfo("male",25);
        resume1.setWorkExperience("2015-2018","xx公司");

        Resume resume2 = (Resume) resume1.clone();
        resume2.setWorkExperience("2015-2018","yy公司");

        Resume resume3 = (Resume)resume1.clone();
        resume3.setPersonInfo("female",29);

        resume1.display();
        resume2.display();
        resume3.display();
    }
}
