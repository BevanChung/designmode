package com.zbf.visitorMode;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/14 13:47
 * @version 1.0
 */
public class Boss implements AccountBookViewer {

    private double totalConsume;
    private double totalIncome;

    @Override
    public void view(ConsumeBill consumeBill) {
        totalConsume += consumeBill.getAmount();
    }

    @Override
    public void view(IncomeBill incomeBill) {
        totalIncome += incomeBill.getAmount();
    }

    public double getTotalConsume() {
        System.out.println("老板查看总花销为："+totalConsume);
        return totalConsume;
    }

    public void setTotalConsume(double totalConsume) {
        this.totalConsume = totalConsume;
    }

    public double getTotalIncome() {
        System.out.println("老板查看总收入为："+totalIncome);
        return totalIncome;
    }

    public void setTotalIncome(double totalIncome) {
        this.totalIncome = totalIncome;
    }
}
