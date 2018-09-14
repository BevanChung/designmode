package com.zbf.singleton;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/13 15:36
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();

        System.out.println(singleton == singleton1);

    }
}
