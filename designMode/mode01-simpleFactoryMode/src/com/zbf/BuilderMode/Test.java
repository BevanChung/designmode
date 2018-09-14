package com.zbf.BuilderMode;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/11 16:14
 * @version 1.0
 */
public class Test {

    public static void main(String[] args) {
        //
        Director director = new Director();
        Builder builder = new ConcreteBuilder();

        director.construct(builder);
        Computer computer = builder.getComputer();
        computer.show();
    }
}
