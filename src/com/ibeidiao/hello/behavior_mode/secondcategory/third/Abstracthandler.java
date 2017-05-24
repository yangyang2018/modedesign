package com.ibeidiao.hello.behavior_mode.secondcategory.third;

/**
*
* @ author  shayu
* @ time  2017/5/24
* @ email shayu@ibeidiao.com
* @ version 1.0
*
*/

public abstract  class Abstracthandler implements Handler {

    private Handler  handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}
