package com.ibeidiao.hello.behavior_mode.firstcategory.second;

/**
*
* @ author  shayu
* @ time  2017/5/23
* @ email shayu@ibeidiao.com
* @ version 1.0
*
*/

public abstract class AbstractCaculator2 {

    /*主方法，实现对本类其它方法的调用*/
    public final int calculate(String exp,String opt){
        int array[] = split(exp,opt);
        return calculate(array[0],array[1]);
    }

    public abstract int calculate(int num1,int num2);


    public int[] split(String exp,String opt){
        String array[] = exp.split(opt);
        int arrayInt[] = new int[2];
        arrayInt[0] = Integer.parseInt(array[0]);
        arrayInt[1] = Integer.parseInt(array[1]);
        return arrayInt;
    }



}
