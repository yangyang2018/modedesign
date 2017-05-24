package com.ibeidiao.hello.behavior_mode.firstcategory.first;

/**
*
* @ author  shayu
* @ time  2017/5/23
* @ email shayu@ibeidiao.com
* @ version 1.0
*
*/

public class Minus  extends AbstractCalculator implements ICalculator {
    @Override
    public int calculate(String exp) {
        int[] intarray = split(exp,"\\-");
        return intarray[0] - intarray[1];
    }
}
