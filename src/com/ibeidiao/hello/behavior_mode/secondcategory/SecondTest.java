package com.ibeidiao.hello.behavior_mode.secondcategory;

import com.ibeidiao.hello.behavior_mode.secondcategory.first.MySubject;
import com.ibeidiao.hello.behavior_mode.secondcategory.first.Observer1;
import com.ibeidiao.hello.behavior_mode.secondcategory.first.Observer2;
import com.ibeidiao.hello.behavior_mode.secondcategory.first.Subject;
import com.ibeidiao.hello.behavior_mode.secondcategory.four.Command;
import com.ibeidiao.hello.behavior_mode.secondcategory.four.Invoker;
import com.ibeidiao.hello.behavior_mode.secondcategory.four.MyCommand;
import com.ibeidiao.hello.behavior_mode.secondcategory.four.Receiver;
import com.ibeidiao.hello.behavior_mode.secondcategory.second.Collection;
import com.ibeidiao.hello.behavior_mode.secondcategory.second.Iterator;
import com.ibeidiao.hello.behavior_mode.secondcategory.second.MyCollection;
import com.ibeidiao.hello.behavior_mode.secondcategory.third.MyHandler;


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
     *
     * @param args
     */
    public static void main1(String[] args) {

        Subject subject = new MySubject();

        subject.add(new Observer1());
        subject.add(new Observer2());

        subject.operation();

    }

    /**
     * 四、迭代子模式
     * 顾名思义，迭代器模式就是顺序访问聚集中的对象，
     * 一般来说，集合中非常常见，如果对集合类比较熟悉的话，理解本模式会十分轻松。
     * 这句话包含两层意思：一是需要遍历的对象，即聚集对象，
     * 二是迭代器对象，用于对聚集对象进行遍历访问。
     *
     * @param args
     */
    public static void main2(String[] args) {

        Collection collection = new MyCollection();

        Iterator iterator = collection.iterator();

        System.out.println(iterator.first());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.previous());
    }

    /**
     * 五、责任链模式
     * 责任链模式，有多个对象，每个对象持有对下一个对象的引用，这样就会形成一条链，请求在这条链上传递，直到某一对象决定处理该请求。
     * 但是发出者并不清楚到底最终那个对象会处理该请求，
     * 所以，责任链模式可以实现，在隐瞒客户端的情况下，对系统进行动态的调整。
     *
     * @param args
     */
    public static void main3(String[] args) {

        MyHandler handler1 = new MyHandler("handler1");
        MyHandler handler2 = new MyHandler("handler2");
        MyHandler handler3 = new MyHandler("handler3");


        handler1.setHandler(handler2);
        handler2.setHandler(handler3);


        handler2.operater();

    }

    /**
     * 六、命令模式
     * 命令模式很好理解，举个例子，司令员下令让士兵去干件事情，从整个事情的角度来考虑，
     * 司令员的作用是，发出口令，
     * 口令经过传递，
     * 传到了士兵耳朵里，士兵去执行。
     * 这个过程好在，三者相互解耦，任何一方都不用去依赖其他人，只需要做好自己的事儿就行，
     * 司令员要的是结果，不会去关注到底士兵是怎么实现的。
     *
     * @param args
     */
    public static void main(String[] args) {
        Receiver receiver = new Receiver();

        Command command = new MyCommand(receiver);

        Invoker invoker = new Invoker(command);

        invoker.action();


    }


}
