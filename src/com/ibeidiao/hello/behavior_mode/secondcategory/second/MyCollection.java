package com.ibeidiao.hello.behavior_mode.secondcategory.second;

/**
*
* @ author  shayu
* @ time  2017/5/24
* @ email shayu@ibeidiao.com
* @ version 1.0
*
*/

public class MyCollection implements Collection<String> {

    String[] strings = new String[]{"A","B","C","D","E"};

    @Override
    public Iterator iterator() {
        return new MyIterator(this);
    }

    @Override
    public String get(int i) {
        if(i < strings.length){
            return strings[i];
        }else {
            return null;
        }
    }

    @Override
    public int size() {
        return strings.length;
    }
}
