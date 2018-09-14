package com.zbf.BuilderMode;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/11 16:11
 * @version 1.0
 */
public class ConcreteBuilder extends Builder {

    Computer computer;

    public ConcreteBuilder(){
        computer = new Computer();
    }

    @Override
    public void buildCPU() {
        computer.add("CPU");
    }

    @Override
    public void buildMainboard() {
        computer.add("主板");
    }

    @Override
    public void buildHD() {
        computer.add("硬盘");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
