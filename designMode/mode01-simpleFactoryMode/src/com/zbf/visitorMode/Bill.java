package com.zbf.visitorMode;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/14 13:38
 * @version 1.0
 */
public interface Bill {

    public void accept(AccountBookViewer accountBookViewer);
}
