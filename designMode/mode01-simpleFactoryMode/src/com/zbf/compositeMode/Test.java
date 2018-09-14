package com.zbf.compositeMode;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/13 14:05
 * @version 1.0
 */
public class Test {

    public static void main(String[] args) {
        ConcreteCompany root = new ConcreteCompany("北京总公司");
        root.add(new HRDepartment("总公司人力资源部"));
        root.add(new FinanceDepartment("总公司财务部"));

        ConcreteCompany composite = new ConcreteCompany("上海华东分公司");
        composite.add(new HRDepartment("华东分公司人力资源部"));
        composite.add(new FinanceDepartment("华东分公司财务部"));
        root.add(composite);

        ConcreteCompany composite1 = new ConcreteCompany("南京办事处");
        composite1.add(new HRDepartment("南京办事处人力资源部"));
        composite1.add(new FinanceDepartment("南京办事处财务部"));
        composite.add(composite1);

        ConcreteCompany composite2 = new ConcreteCompany("杭州办事处");
        composite2.add(new HRDepartment("杭州办事处人力资源部"));
        composite2.add(new FinanceDepartment("杭州办事处财务部"));
        composite.add(composite2);

        System.out.println("结构图：");
        root.display(1);
    }
}
