package com.zbf.commandMode;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/13 16:35
 * @version 1.0
 */
public class Test {

    public static void main(String[] args) {

        //开店前准备
        Barbecuer boy =new Barbecuer();
        BakeChickenWingCommand bakeChickenWingCommand = new BakeChickenWingCommand(boy);
        BakeChickenWingCommand bakeChickenWingCommand1 = new BakeChickenWingCommand(boy);
        BakeMuttonCommand bakeMuttonCommand = new BakeMuttonCommand(boy);
        Waiter girl = new Waiter();

        //顾客点菜
        girl.setOrder(bakeChickenWingCommand);
        girl.setOrder(bakeChickenWingCommand1);
        girl.setOrder(bakeMuttonCommand);

        //通知厨房
        girl.notifyMessage();
    }
}
