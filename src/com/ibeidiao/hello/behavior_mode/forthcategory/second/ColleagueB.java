package com.ibeidiao.hello.behavior_mode.forthcategory.second;

/**
*
* @ author  shayu
* @ time  2017/5/24
* @ email shayu@ibeidiao.com
* @ version 1.0
*
*/

public class ColleagueB extends AbstractColleague {
    /**
     * 既然有中介者，那么每个具体同事必然要与中介者有联系，
     * 否则就没必要存在于 这个系统当中，这里的构造函数相当
     * 于向该系统中注册一个中介者，以取得联系
     *
     * @param abstactMediator
     */
    public ColleagueB(AbstactMediator abstactMediator) {
        super(abstactMediator);
    }

    //每个具体同事必然有自己分内的事，没必要与外界相关联
    public void self() {
        System.out.println("同事B --> 做好自己分内的事情 ...");
    }

    //每个具体同事总有需要与外界交互的操作，通过中介者来处理这些逻辑并安排工作
    public void out() {
        System.out.println("同事A --> 请求同事B做好分内工作 ...");
        super.abstactMediator.execute("ColleagueA", "self");
    }
}
