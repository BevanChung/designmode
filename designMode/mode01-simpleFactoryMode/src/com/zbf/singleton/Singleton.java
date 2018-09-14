package com.zbf.singleton;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/13 15:33
 * @version 1.0
 */
public class Singleton {

    private static Singleton instance;
    //进程辅助对象
    public static Object syncRoot = new Object();


    private Singleton() {
    }

    public static Singleton getInstance(){
        if(null == instance){
            synchronized (syncRoot){
                if(null == instance){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
