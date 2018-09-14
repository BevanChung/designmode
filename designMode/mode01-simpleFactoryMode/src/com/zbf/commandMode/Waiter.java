package com.zbf.commandMode;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/13 16:59
 * @version 1.0
 */
public class Waiter {

    private List<Command> list = new ArrayList<>();

    public void setOrder(Command command){
        list.add(command);
        System.out.println("增加新订单："+command.getClass().getName());
    }

    public void cancelOrder(Command command){
        list.remove(command);
        System.out.println("取消订单："+command.getClass().getName());
    }

    public void notifyMessage(){
        for (Command comand:list) {
            comand.excuteCommand();
        }
    }
}
