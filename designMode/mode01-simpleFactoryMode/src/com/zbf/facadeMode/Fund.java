package com.zbf.facadeMode;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/11 15:46
 * @version 1.0
 */
public class Fund {

    private Stock stock;

    private NationalDept nationalDept;

    public Fund() {
        this.stock = new Stock();
        this.nationalDept = new NationalDept();
    }
    public void buyFund(){
        stock.buy();
        nationalDept.buy();
    }
    public void sellFund(){
        stock.sell();
        nationalDept.sell();
    }
}
