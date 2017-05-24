package com.ibeidiao.hello.behavior_mode.secondcategory.second;

/**
*
* @ author  shayu
* @ time  2017/5/24
* @ email shayu@ibeidiao.com
* @ version 1.0
*
*/

public interface Collection<T> {

    public Iterator<T> iterator();


    public  T get(int i);

    public  int size();

}
