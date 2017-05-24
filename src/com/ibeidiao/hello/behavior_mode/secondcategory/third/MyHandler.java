package com.ibeidiao.hello.behavior_mode.secondcategory.third;

/**
*
* @ author  shayu
* @ time  2017/5/24
* @ email shayu@ibeidiao.com
* @ version 1.0
*
*/

public class MyHandler extends Abstracthandler implements Handler {

    private String name;

    public MyHandler(String name) {
        this.name = name;
    }
    @Override
    public void operater() {
        System.out.println(name+"deal !");
        if (getHandler() != null) {
            getHandler().operater();
        }
    }
}
