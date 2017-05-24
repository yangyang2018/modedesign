package com.ibeidiao.hello.behavior_mode.forthcategory.first;

/**
*
* @ author  shayu
* @ time  2017/5/24
* @ email shayu@ibeidiao.com
* @ version 1.0
*
*/

public class Visitor implements IVisitor {
    @Override
    public void visit(ConcreteElement1 el1) {

        el1.doSomething();
    }

    @Override
    public void visit(ConcreteElement2 el2) {
        el2.doSomething();

    }
}
