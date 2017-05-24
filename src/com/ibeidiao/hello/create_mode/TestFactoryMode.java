package com.ibeidiao.hello.create_mode;

/**
*
* @ author  shayu
* @ time  2017/5/24
* @ email shayu@ibeidiao.com
* @ version 1.0
*
*/

/**
 *
 *
 3.1、工厂方法模式

 工厂方法模式分为三种：普通工厂模式、多个工厂方法模式和静态工厂方法模式。


 */
interface MyInterface {
    public void print();
}

class MyInterfaceImplA implements MyInterface{

    @Override
    public void print() {
        System.out.println("MyInterfaceImplA print");
    }
}

class MyInterfaceImplB implements MyInterface{

    @Override
    public void print() {
        System.out.println("MyInterfaceImplB print");
    }
}

class MyInterfaceFactory {
    /**
     * 3.1.1、普通工厂模式

     普通工厂模式就是建立一个工厂类，对实现了同一接口的一些类进行实例的创建。
     *
     * @param type
     * @return
     */
    public  MyInterface  getMyInterface(String type) {
        if ("One".equals(type)) {
            return new MyInterfaceImplA();
        } else if ("Two".equals(type)) {
            return new MyInterfaceImplB();
        }
        return null;
    }

    /**
     * 3.1.2、多个工厂方法模式

     多个工厂方法模式，是对普通工厂方法模式的改进，多个工厂方法模式就是提供多个工厂方法，分别创建对象。
     * @return
     */
    public  MyInterface  getMyInterfaceImplA() {

        return new MyInterfaceImplA();
    }

    public  MyInterface  getMyInterfaceImplB() {

        return new MyInterfaceImplB();
    }

    /**
     * 3.1.2、多个工厂方法模式

     多个工厂方法模式，是对普通工厂方法模式的改进，多个工厂方法模式就是提供多个工厂方法，分别创建对象。
     *
     * @return
     */
    public static MyInterface  getStaticMyInterfaceImplA() {

        return new MyInterfaceImplA();
    }

    public static  MyInterface  getStaticMyInterfaceImplB() {

        return new MyInterfaceImplB();
    }

}



/**
 * 3.2、抽象工厂模式

 工厂方法模式有一个问题就是，类的创建依赖工厂类，也就是说，如果想要拓展程序，必须对工厂类进行修改，这违背了闭包原则。

 为解决这个问题，我们来看看抽象工厂模式：创建多个工厂类，这样一旦需要增加新的功能，直接增加新的工厂类就可以了，不需要修改之前的代码。

 这样就符合闭包原则了。
 */
interface Provider {
     MyInterface produce();
}
class MyFactoryOne implements Provider {

    @Override
    public MyInterface produce() {
        return new MyInterfaceImplA();
    }

}

class MyFactoryTwo implements Provider {

    @Override
    public MyInterface produce() {
        return new MyInterfaceImplB();
    }

}


public class TestFactoryMode {

    public static void main(String[] args) {
        MyInterface myInterface =new  MyInterfaceFactory().getMyInterface("One");
        myInterface.print();
        MyInterface myInterface2 =new  MyInterfaceFactory().getMyInterface("Two");
        myInterface2.print();
    }


}
