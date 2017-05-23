package com.ibeidiao.hello.behavior_mode.firstcategory;


/**
*
* @ author  shayu
* @ time  2017/5/23
* @ email shayu@ibeidiao.com
* @ version 1.0
*
*/

public class FirstTest {

    /**
     *
     *  一、策略模式
     策略模式定义了一系列算法，并将每个算法封装起来，使他们可以相互替换，且算法的变化不会影响到使用算法的客户。
     需要设计一个接口，为一系列实现类提供统一的方法，多个实现类实现该接口，
     设计一个抽象类（可有可无，属于辅助类，视实际需求是否添加），提供辅助函数。
     * @param args
     */

    public static void main1(String[] args) {
        ICalculator  calculator = new Plus();
        System.out.println(calculator.calculate("2+4"));
    }

    public static void main2(String[] args) {
        ICalculator  calculator = new Minus();
        System.out.println(calculator.calculate("2-4"));
    }

    public static void main3(String[] args) {
        ICalculator  calculator = new Mutiply();
        System.out.println(calculator.calculate("2*4"));
    }

    /**
     * 二、模板方法模式
     * 解释一下模板方法模式，就是指：一个抽象类中，有一个主方法，再定义1…n个方法，可以是抽象的，
     * 也可以是实际的方法，定义一个类，继承该抽象类，重写抽象方法，通过调用抽象类，实现对子类的调用。
     * @param args
     */
    public static void main(String[] args) {

        AbstractCaculator2  abstractCaculator2 = new Plus2();

        System.out.println(abstractCaculator2.calculate("2+3","\\+"));

    }


}
