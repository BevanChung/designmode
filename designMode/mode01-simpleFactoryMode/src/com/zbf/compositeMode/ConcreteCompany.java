package com.zbf.compositeMode;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/13 13:42
 * @version 1.0
 */
public class ConcreteCompany extends Company {

    private List<Company> childreList = new ArrayList<>();

    private String name;

    public ConcreteCompany(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void add(Company company) {
        childreList.add(company);
    }

    @Override
    public void remove(Company company) {
        childreList.remove(company);
    }

    @Override
    public void display(int depth) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0;i<depth;i++){
            stringBuilder.append("- ");
        }
        System.out.println(stringBuilder+name);
        for (Company company:childreList) {
            company.display(depth+2);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
