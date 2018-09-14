package com.zbf.compositeMode;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/13 13:38
 * @version 1.0
 */
public abstract class Company {

    private String name;

    public Company(String name) {
        this.name = name;
    }

    public abstract void add(Company company);

    public abstract void remove(Company company);

    public abstract void display(int depth);

}
