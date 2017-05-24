package com.ibeidiao.hello.behavior_mode.thirdcategory.second;


/**
 * @ author  shayu
 * @ time  2017/5/24
 * @ email shayu@ibeidiao.com
 * @ version 1.0
 */

public class State {

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void method1() {

        System.out.println("执行了 method1");
    }

    public void method2() {

        System.out.println("执行了 method2");
    }

}
