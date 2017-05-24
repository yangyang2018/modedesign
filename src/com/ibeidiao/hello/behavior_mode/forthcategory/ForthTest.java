package com.ibeidiao.hello.behavior_mode.forthcategory;

import com.ibeidiao.hello.behavior_mode.forthcategory.third.Minus;
import com.ibeidiao.hello.behavior_mode.forthcategory.first.Element;
import com.ibeidiao.hello.behavior_mode.forthcategory.first.ObjectStruture;
import com.ibeidiao.hello.behavior_mode.forthcategory.first.Visitor;
import com.ibeidiao.hello.behavior_mode.forthcategory.second.AbstactMediator;
import com.ibeidiao.hello.behavior_mode.forthcategory.second.ColleagueA;
import com.ibeidiao.hello.behavior_mode.forthcategory.second.ColleagueB;
import com.ibeidiao.hello.behavior_mode.forthcategory.second.MyMediator;
import com.ibeidiao.hello.behavior_mode.forthcategory.third.Context;

import java.util.List;

/**
 * Created by Administrator on 2017/5/24.
 */
public class ForthTest {
    /**九、访问者模式
     访问者模式把  数据结构 和 作用于结构 上的操作解耦合，使得操作集合可相对自由地演化。
     访问者模式适用于数据结构相对稳定算法又易变化的系统。
     因为访问者模式使得算法操作增加变得容易。
     若系统数据结构对象易于变化，经常有新的数据对象增加进来，则不适合使用访问者模式。
     访问者模式的优点是增加操作很容易，因为增加操作意味着增加新的访问者。
     访问者模式将有关行为集中到一个访问者对象中，其改变不影响系统数据结构。其缺点就是增加新的数据结构很困难。

     访问者模式算是最复杂也是最难以理解的一种模式了。
     它表示一个作用于某对象结构中的各元素的操作。它使你可以在不改变各元素类的前提下定义作用于这些元素的新操作。

     涉及角色：

     1.IVisitor 抽象访问者角色，为该对象结构中具体元素角色声明一个访问操作接口。
     该操作接口的名字和参数标识了发送访问请求给具体访问者的具体元素角色，这样访问者就可以通过该元素角色的特定接口直接访问它。

     2.Visitor.具体访问者角色，实现IVisitor声明的接口。

     3.Element 定义一个接受访问操作(accept())，它以一个访问者(Visitor)作为参数。

     4.ConcreteElement 具体元素，实现了抽象元素(Element)所定义的接受操作接口。

     5.ObjectStructure 结构对象角色，这是使用访问者模式必备的角色。
     它具备以下特性：能枚举它的元素；
     可以提供一个高层接口以允许访问者访问它的元素；
     如有需要，可以设计成一个复合对象或者一个聚集（如一个列表或无序集合）。

     * @param args
     */

    public static void main1(String[] args) {

        List<Element> list = ObjectStruture.getList();
        for(Element e:list){
            e.accept(new Visitor());
        }

    }


    /**
     * 十、中介者模式

     中介者模式（Mediator）：用一个中介对象来封装一系列的对象交互。
     中介者使各对象不需要显式地相互引用，从而使其耦合松散，而且可以独立地改变它们之间的交互。

     举例：在一个公司里面，有很多部门、员工（我们统称他们互相为Colleague“同事”），为了完成一定的任务，“同事”之间肯定有许多需要
     互相配合、交流的过程。如果由各个“同事”频繁地到处去与自己有关的“同事”沟通，这样肯定会形成一个多对多的杂乱的联系网络而造成工作
     效率低下。

     此时就需要一位专门的“中介者”给各个“同事”分配任务，以及统一跟进大家的进度并在“同事”之间实时地进行交互，保证“同事”之间必须的
     沟通交流。很明显我们知道此时的“中介者”担任了沟通“同事”彼此之间的重要角色了，“中介者”使得每个“同事”都变成一对一的联系方式，
     减轻了每个“同事”的负担，增强工作效率。
     *
     * @param args
     */
    public static void main2(String[] args) {

        AbstactMediator mediator = new MyMediator();

        ColleagueA colleagueA = new ColleagueA(mediator);
        ColleagueB colleagueB = new ColleagueB(mediator);

        //中介者分别与每个同事建立联系
        mediator.addColleague("ColleagueA", colleagueA);
        mediator.addColleague("ColleagueB", colleagueB);

        colleagueA.self();
        colleagueA.out();
        System.out.println("任务完成 合作愉快");


        colleagueB.self();
        colleagueB.out();
        System.out.println("任务完成 合作愉快");

    }

    /**
     *
     * 十一、解释器模式

     解释器模式：给定一种语言，定义他的文法的一种表示，并定义一个解释器，该解释器使用该表示来解释语言中句子。
     *
     * @param args
     */
    public static void main(String[] args) {


        int result = new Minus().interpret(new Context(2,3));
        System.out.println(result);

    }
}
