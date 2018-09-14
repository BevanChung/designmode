package com.zbf.proxyMode;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/11 10:33
 * @version 1.0
 */
public class Proxy implements GiveGift {

    Pursuer pursuer;

    public Proxy(SchoolGirl schoolGirl){
        this.pursuer = new Pursuer(schoolGirl);
    }

    @Override
    public void giveDolls() {
        pursuer.giveDolls();
    }

    @Override
    public void giveFlowers() {
        pursuer.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        pursuer.giveChocolate();
    }
}
