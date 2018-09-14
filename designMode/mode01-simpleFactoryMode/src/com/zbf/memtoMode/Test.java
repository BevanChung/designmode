package com.zbf.memtoMode;

/**
 * Description:
 *
 * @author zbf
 * date: 2018/9/13 10:44
 * @version 1.0
 */
public class Test {

    public static void main(String[] args) {

        //originator初始状态on
        Originator originator = new Originator();
        originator.setState("on");
        originator.show();

        //保存状态时，由于有很好的封装，可以隐藏originator的实现细节
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemto());

        //originator改变状态off
        originator.setState("off");
        originator.show();

        //恢复原始状态
        originator.setMemento(caretaker.getMemento());
        originator.show();
    }
}
