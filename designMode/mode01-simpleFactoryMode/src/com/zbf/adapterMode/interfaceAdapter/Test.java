package com.zbf.adapterMode.interfaceAdapter;

import com.zbf.adapterMode.classAdapter.Volt220;
import com.zbf.adapterMode.objectAdapter.Adapter;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/13 9:24
 * @version 1.0
 */
public class Test {

    public static void main(String[] args) {
        VoltAdapter voltAdapter = new VoltImpl();
        int volt = voltAdapter.output5();
        System.out.println("开始充电："+volt +"v");
    }
}
