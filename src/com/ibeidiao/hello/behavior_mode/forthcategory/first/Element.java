package com.ibeidiao.hello.behavior_mode.forthcategory.first;

/**
*
* @ author  shayu
* @ time  2017/5/24
* @ email shayu@ibeidiao.com
* @ version 1.0
*
*/

public abstract class Element {

    public abstract void accept(IVisitor visitor);
    public abstract void doSomething();

}
