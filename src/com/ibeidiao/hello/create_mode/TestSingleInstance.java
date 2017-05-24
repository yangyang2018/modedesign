package com.ibeidiao.hello.create_mode;

/**
*
* @ author  shayu
* @ time  2017/5/24
* @ email shayu@ibeidiao.com
* @ version 1.0
*
*/

public class TestSingleInstance {

    private static TestSingleInstance instance;

    private TestSingleInstance() {

    }

    public static TestSingleInstance getInstance() {
        if (instance != null) {
        } else {
            instance = new TestSingleInstance();
        }
        return instance;
    }

    public static void main(String[] args) {

        TestSingleInstance instance = TestSingleInstance.getInstance();
        System.out.println(instance);
    }

}
