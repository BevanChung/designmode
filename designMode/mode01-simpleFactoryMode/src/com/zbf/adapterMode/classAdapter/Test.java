package com.zbf.adapterMode.classAdapter;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/13 9:24
 * @version 1.0
 */
public class Test {

    public static void main(String[] args) {
        Adapter adapter = new Adapter();
        int volt = adapter.output5();
        System.out.println("开始充电："+volt +"v");
    }
}
