package com.zbf.commandMode;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/13 16:56
 * @version 1.0
 */
public class BakeMuttonCommand extends Command {

    public BakeMuttonCommand(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    public void excuteCommand() {
        receiver.bakeMutton();
    }
}
