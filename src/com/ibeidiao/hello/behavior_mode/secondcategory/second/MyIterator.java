package com.ibeidiao.hello.behavior_mode.secondcategory.second;

/**
*
* @ author  shayu
* @ time  2017/5/24
* @ email shayu@ibeidiao.com
* @ version 1.0
*
*/

public class MyIterator implements Iterator<String>{

    private Collection<String>  collection;
    private int pos = -1;

    public MyIterator(Collection<String> collection){
        this.collection = collection;
    }

    @Override
    public String  previous() {
        if(pos > 0){
            pos -- ;
        }
        return collection.get(pos);
    }

    @Override
    public String next() {
        if(pos < collection.size()-1){
            pos ++ ;
        }
        return collection.get(pos);
    }

    @Override
    public boolean hasNext() {
        if(pos<collection.size()-1){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String first() {
        pos = 0;
        return collection.get(pos);
    }
}
