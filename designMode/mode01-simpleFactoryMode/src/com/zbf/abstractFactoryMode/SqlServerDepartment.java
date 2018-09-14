package com.zbf.abstractFactoryMode;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/12 10:37
 * @version 1.0
 */
public class SqlServerDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        System.out.println("sqlserver 插入一条数据！");
    }

    @Override
    public void getDepartment(String id) {
        System.out.println("sqlserver查询一条记录");
    }
}
