package com.zbf.strategyMode;


/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/10 16:05
 * @version 1.0
 */
public class Test {

    public static void main(String[] args) {
        //策略模式应用
        Context context = null;
        String type = "normal";
        switch (type){
            case "normal":
                context = new Context(new CashNormal());
                break;
            case "return":
                context = new Context(new CashReturn(300,100));
                break;
            case "rebate":
                context = new Context(new CashRebate(0.8));
                break;
        }
        double total = context.getMoney(2000);
        System.out.println(total);

        /**
         * 策略模式与简单工厂模式的结合，使得客户端只需知道sfc类即可，而单纯的策略模式客户端需要认识context及caseSuper，
         * 此方式降低了耦合度
         */
        SimpleFactoryContext sfc = new SimpleFactoryContext("return");
        double m = sfc.getResult(2000);
        System.out.println(m);

        //反射机制
        Class[] paramTypes2 = {double.class};
        Object[] params2 = {0.8d};
        FsContext fc = new FsContext(1,paramTypes2,params2);
        double mon = fc.getResult(2000);
        System.out.println(mon);
    }
}
