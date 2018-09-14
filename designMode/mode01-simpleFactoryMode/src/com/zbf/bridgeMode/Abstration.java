package com.zbf.bridgeMode;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/13 15:56
 * @version 1.0
 */
public class Abstration {

    protected Implementor implementor;

    public Implementor getImplementor() {
        return implementor;
    }

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    public void operation(){
        implementor.operation();
    }
}
