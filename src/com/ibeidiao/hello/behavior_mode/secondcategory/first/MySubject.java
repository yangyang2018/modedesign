package com.ibeidiao.hello.behavior_mode.secondcategory.first;

/**
 * Created by Administrator on 2017/5/23.
 */
public class MySubject extends AbstractSubject{

    @Override
    public void operation() {

        System.out.println("update self......");
        notifyAllObserver();

    }
}
