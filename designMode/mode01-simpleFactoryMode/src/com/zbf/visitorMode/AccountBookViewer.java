package com.zbf.visitorMode;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/14 13:45
 * @version 1.0
 */
public interface AccountBookViewer {

    void view(ConsumeBill consumeBill);

    void view(IncomeBill incomeBill);
}
