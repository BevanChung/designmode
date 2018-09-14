package com.zbf.visitorMode;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/14 13:57
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        AccountBook accountBook = new AccountBook();

        //添加两条收入
        accountBook.addBill(new IncomeBill(10000,"卖商品"));
        accountBook.addBill(new IncomeBill(20000,"卖广告位"));

        //添加两条支出
        accountBook.addBill(new ConsumeBill(1000,"工资"));
        accountBook.addBill(new ConsumeBill(2000,"材料费"));

        AccountBookViewer boss = new Boss();
        AccountBookViewer cpa = new CPA();

        accountBook.show(boss);
        accountBook.show(cpa);
        ((Boss)boss).getTotalIncome();
        ((Boss)boss).getTotalConsume();

    }
}
