package com.ibeidiao.hello.behavior_mode.thirdcategory.second;

/**
*
* @ author  shayu
* @ time  2017/5/24
* @ email shayu@ibeidiao.com
* @ version 1.0
*
*/

public class Context {

    private State state;

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
    public void method(){
        System.out.println("state的状态+"+state.getValue());
        if (state.getValue().equals("state1")) {
            state.method1();
        }else if (state.getValue().equals("state2")){
            state.method2();
        }

    }

}
