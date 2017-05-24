package com.ibeidiao.hello.create_mode;

/**
*
* @ author  shayu
* @ time  2017/5/24
* @ email shayu@ibeidiao.com
* @ version 1.0
*
*/

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 *3.4、建造者模式

 建造者模式：是将一个复杂的对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。

 字面看来非常抽象，实际上它也十分抽象！！！！

 建造者模式通常包括下面几个角色：

 （1） Builder：给出一个抽象接口，以规范产品对象的各个组成成分的建造。这个接口规定要实现复杂对象的哪些部分的创建，并不涉及具体的对象部件的创建。

 （2） ConcreteBuilder：实现Builder接口，针对不同的商业逻辑，具体化复杂对象的各部分的创建。 在建造过程完成后，提供产品的实例。

 （3）Director：调用具体建造者来创建复杂对象的各个部分，在指导者中不涉及具体产品的信息，只负责保证对象各部分完整创建或按某种顺序创建。

 （4）Product：要创建的复杂对象。

 在游戏开发中建造小人是经常的事了，要求是：小人必须包括头，身体和脚。
 */

class Person {

    String head;
    String body;
    String foot;

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getFoot() {
        return foot;
    }

    public void setFoot(String foot) {
        this.foot = foot;
    }

    /***
     *
     * apache :
     * commons.lang.jar
     * @return
     */
    @Override
    public String toString() {
        System.out.println("DEFAULT_STYLE : "+ToStringBuilder.reflectionToString(this,
                ToStringStyle.DEFAULT_STYLE));
        System.out.println("SIMPLE_STYLE : "+ToStringBuilder.reflectionToString(this,
                ToStringStyle.SIMPLE_STYLE));
        System.out.println("MULTI_LINE_STYLE : "+ToStringBuilder.reflectionToString(this,
                ToStringStyle.MULTI_LINE_STYLE));
        System.out.println("SHORT_PREFIX_STYLE : "+ToStringBuilder.reflectionToString(this,
                ToStringStyle.SHORT_PREFIX_STYLE));
        System.out.println("NO_FIELD_NAMES_STYLE : "+ToStringBuilder.reflectionToString(this,
                ToStringStyle.NO_FIELD_NAMES_STYLE));
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}

interface PersonBuilder{

    void buildHead();
    void buildBody();
    void buildFoot();
    Person buildPerson();

}


class ManBuilder implements PersonBuilder{

    private Person person;

    public ManBuilder(Person person) {
        this.person = person;
    }

    @Override
    public void buildHead() {

        person.setHead("build head of man ");
    }

    @Override
    public void buildBody() {
        person.setBody("build head of man ");

    }

    @Override
    public void buildFoot() {

        person.setFoot("build head of man ");
    }

    @Override
    public Person buildPerson() {
       return person;
    }
}

class BuilderDirecter {

    public  Person  PersonConstructor(PersonBuilder builder){

        builder.buildHead();
        builder.buildBody();
        builder.buildFoot();

        return builder.buildPerson();

    }


}



public class TestBuildMode {


    public static void main(String[] args) {
        BuilderDirecter directer =  new BuilderDirecter();

        Person  person =  new Person();
        directer.PersonConstructor(new ManBuilder(person));

        System.out.println(person);
    }


}
