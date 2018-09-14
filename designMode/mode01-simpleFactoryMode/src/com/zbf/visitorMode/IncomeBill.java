package com.zbf.visitorMode;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/14 13:42
 * @version 1.0
 */
public class IncomeBill implements Bill {

    private double amount;
    private String item;

    public IncomeBill(double amount, String item) {
        super();
        this.amount = amount;
        this.item = item;
    }

    @Override
    public void accept(AccountBookViewer accountBookViewer) {
        accountBookViewer.view(this);
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}
