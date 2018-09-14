package com.zbf.commandMode;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/13 16:58
 * @version 1.0
 */
public class BakeChickenWingCommand extends Command {


    public BakeChickenWingCommand(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    public void excuteCommand() {
        receiver.bakeChilkenWing();
    }
}
