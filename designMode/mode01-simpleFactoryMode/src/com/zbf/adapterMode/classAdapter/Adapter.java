package com.zbf.adapterMode.classAdapter;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/13 9:20
 * @version 1.0
 */
public class Adapter extends Volt220 implements Volt5 {
    @Override
    public int output5() {
        int volt = output220();
        System.out.println("适配器开始适配电压: "+volt);
        int dist = volt/44;
        System.out.println("适配后输出电压: "+dist);
        return dist;
    }
}
