package com.ibeidiao.hello.behavior_mode.secondcategory;

/**
 * @ author  shayu
 * @ time  2017/5/23
 * @ email shayu@ibeidiao.com
 * @ version 1.0
 */

public class SecondTest {
    /**
     * 观察者模式
     * 很好理解，类似于邮件订阅和RSS订阅，当我们浏览一些博客或wiki时，
     * 经常会看到RSS图标，就这的意思是，当你订阅了该文章，如果后续有更新，会及时通知你。
     * 其实，简单来讲就一句话：当一个对象变化时，其它依赖该对象的对象都会收到通知，
     * 并且随着变化！对象之间是一种一对多的关系。
     * @param args
     */
    public static void main(String[] args) {

        Subject subject = new MySubject();

        subject.add(new Observer1());
        subject.add(new Observer2());

        subject.operation();

    }


}
