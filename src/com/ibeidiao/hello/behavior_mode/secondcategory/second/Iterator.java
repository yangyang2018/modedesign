package com.ibeidiao.hello.behavior_mode.secondcategory.second;

/**
*
* @ author  shayu
* @ time  2017/5/24
* @ email shayu@ibeidiao.com
* @ version 1.0
*
*/

public interface Iterator<T>  {

    // 前移
    public T previous();

    // 后移
    public T next();

    public boolean hasNext();

    // 取得第一个元素
    public T first();

}
