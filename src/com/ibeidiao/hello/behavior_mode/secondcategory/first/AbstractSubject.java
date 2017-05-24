package com.ibeidiao.hello.behavior_mode.secondcategory.first;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @ author  shayu
 * @ time  2017/5/23
 * @ email shayu@ibeidiao.com
 * @ version 1.0
 */

public   abstract class AbstractSubject implements Subject {

    private Vector<Observer> observers = new Vector<>();

    @Override
    public void add(Observer observer) {

        observers.add(observer);
    }

    @Override
    public void del(Observer observer) {

        observers.remove(observer);
    }


    @Override
    public void notifyAllObserver() {
        Enumeration<Observer> elements = observers.elements();
        while (elements.hasMoreElements()) {
            elements.nextElement().update();
        }
    }


}
