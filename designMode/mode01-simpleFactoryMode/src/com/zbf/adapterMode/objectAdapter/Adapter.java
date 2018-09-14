package com.zbf.adapterMode.objectAdapter;

import com.zbf.adapterMode.classAdapter.Volt220;
import com.zbf.adapterMode.classAdapter.Volt5;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/13 9:20
 * @version 1.0
 */
public class Adapter implements Volt5 {

    private Volt220 volt220;

    public Adapter(Volt220 volt220) {
        this.volt220 = volt220;
    }

    @Override
    public int output5() {
        int volt = volt220.output220();
        System.out.println("适配器开始适配电压: "+volt);
        int dist = volt/44;
        System.out.println("适配后输出电压: "+dist);
        return dist;
    }
}
