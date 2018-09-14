package com.zbf.compositeMode;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/13 14:03
 * @version 1.0
 */
public class FinanceDepartment extends Company {

    private String name;

    public FinanceDepartment(String name) {
        super(name);
        this.name = name;
    }


    @Override
    public void add(Company company) {

    }

    @Override
    public void remove(Company company) {

    }

    @Override
    public void display(int depth) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0;i<depth;i++){
            stringBuilder.append("- ");
        }
        System.out.println(stringBuilder+name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
