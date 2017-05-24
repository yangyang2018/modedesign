package com.ibeidiao.hello.behavior_mode.thirdcategory;

import com.ibeidiao.hello.behavior_mode.thirdcategory.first.Original;
import com.ibeidiao.hello.behavior_mode.thirdcategory.first.Storage;
import com.ibeidiao.hello.behavior_mode.thirdcategory.second.Context;
import com.ibeidiao.hello.behavior_mode.thirdcategory.second.State;

/**
*
* @ author  shayu
* @ time  2017/5/24
* @ email shayu@ibeidiao.com
* @ version 1.0
*
*/

public class ThirdTest {


    /**
     *七、备忘录模式
     主要目的是保存一个对象的某个状态，以便在适当的时候恢复对象，个人觉得叫备份模式更形象些，
     通俗的讲下：假设有原始类A，A中有各种属性，A可以决定需要备份的属性，
     备忘录类B是用来存储A的一些内部状态，
     类C呢，就是一个用来存储备忘录的，且只能存储，不能修改等操作。
     * @param args
     */
    public static void main1(String[] args) {

        //创建原始类
        Original original = new Original("sss");

        //创建备忘录
        Storage storage = new Storage(original.createMemento());



        // 修改原始类的状态
        System.out.println("初始化状态为：" + original.getName());
        original.setName("niu");
        System.out.println("修改后的状态为：" + original.getName());

        //从备忘录中恢复数据
        original.restoreMemento(storage.getMemento());
        System.out.println("恢复后的状态为：" + original.getName());



    }

    /**
     *核心思想就是：当对象的状态改变时，同时改变其行为，很好理解！
     * 就拿QQ来说，有几种状态，在线、隐身、忙碌等，每个状态对应不同的操作，而且你的好友也能看到你的状态，
     * 所以，状态模式就两点：
     * 1、可以通过改变状态来获得不同的行为。
     * 2、你的好友能同时看到你的变化。
     * @param args
     */

    public static void main(String[] args) {
        State  state = new State();
        Context context = new Context(state);
        state.setValue("state1");
        context.method();
        state.setValue("state2");
        context.method();

    }

}
