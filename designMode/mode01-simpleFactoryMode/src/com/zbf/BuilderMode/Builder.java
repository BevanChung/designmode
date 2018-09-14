package com.zbf.BuilderMode;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/11 16:08
 * @version 1.0
 */
public abstract class Builder {

    //第一步：装CPU
    public abstract void  buildCPU();

    //第二步：装主板
    public abstract void buildMainboard();

    //第三步：装硬盘
    public abstract void buildHD();

    //返回产品的方法：获得组装好的电脑
    public abstract Computer getComputer();
}
