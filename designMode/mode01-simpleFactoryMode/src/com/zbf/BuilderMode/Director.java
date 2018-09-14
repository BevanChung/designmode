package com.zbf.BuilderMode;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/11 16:10
 * @version 1.0
 */
public class Director {

    //指挥装机人员组装电脑
    public void construct(Builder builder){
        builder. buildCPU();
        builder.buildMainboard();
        builder.buildHD();
    }
}
