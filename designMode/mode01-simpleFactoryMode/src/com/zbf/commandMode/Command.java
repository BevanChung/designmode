package com.zbf.commandMode;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/13 16:55
 * @version 1.0
 */
public abstract class Command {

    protected Barbecuer receiver;

    public Command(Barbecuer receiver) {
        this.receiver = receiver;
    }
    public abstract void excuteCommand();

}
