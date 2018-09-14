package com.zbf.abstractFactoryMode;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/12 10:40
 * @version 1.0
 */
public class AccessDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        System.out.println("access 插入一条数据！");
    }

    @Override
    public void getDepartment(String id) {
        System.out.println("access查询一条数据！");
    }
}
