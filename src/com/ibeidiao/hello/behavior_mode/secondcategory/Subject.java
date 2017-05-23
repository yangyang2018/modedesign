package com.ibeidiao.hello.behavior_mode.secondcategory;

import sun.reflect.generics.tree.VoidDescriptor;

import javax.jws.Oneway;

/**
*
* @ author  shayu
* @ time  2017/5/23
* @ email shayu@ibeidiao.com
* @ version 1.0
*
*/

public interface  Subject{

    void add(Observer observer);

    void del(Observer observer);

    void notifyAllObserver();

    void operation();

}
