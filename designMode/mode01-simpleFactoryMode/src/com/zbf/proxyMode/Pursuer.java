package com.zbf.proxyMode;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/11 10:31
 * @version 1.0
 */
public class Pursuer implements GiveGift {

    SchoolGirl schoolGirl;

    public Pursuer(SchoolGirl schoolGirl){
        this.schoolGirl = schoolGirl;
    }
    @Override
    public void giveDolls() {
        System.out.println(schoolGirl.getName() + ",送你娃娃！");
    }

    @Override
    public void giveFlowers() {
        System.out.println(schoolGirl.getName() + ",送你鲜花！");
    }

    @Override
    public void giveChocolate() {
        System.out.println(schoolGirl.getName() + ",送你巧克力！");
    }
}
