package com.ibeidiao.hello.behavior_mode.forthcategory.second;

/**
*
* @ author  shayu
* @ time  2017/5/24
* @ email shayu@ibeidiao.com
* @ version 1.0
*
*/

public abstract class AbstractColleague {

    protected AbstactMediator abstactMediator;

    /**既然有中介者，那么每个具体同事必然要与中介者有联系，
     * 否则就没必要存在于 这个系统当中，这里的构造函数相当
     * 于向该系统中注册一个中介者，以取得联系
     */
    public AbstractColleague(AbstactMediator abstactMediator) {
        this.abstactMediator = abstactMediator;
    }


    // 在抽象同事类中添加用于与中介者取得联系（即注册）的方法
    public void setAbstactMediator(AbstactMediator abstactMediator) {
        this.abstactMediator = abstactMediator;
    }
}
