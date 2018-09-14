package com.zbf.visitorMode;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/14 13:54
 * @version 1.0
 */
public class AccountBook {

    private List<Bill> list = new ArrayList<>();

    public void addBill(Bill bill){
        list.add(bill);
    }

    public void show(AccountBookViewer accountBookViewer){
        for (Bill bill: list) {
            bill.accept(accountBookViewer);
        }
    }
}
