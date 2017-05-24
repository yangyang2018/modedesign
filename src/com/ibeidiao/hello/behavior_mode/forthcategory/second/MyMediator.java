package com.ibeidiao.hello.behavior_mode.forthcategory.second;

/**
*
* @ author  shayu
* @ time  2017/5/24
* @ email shayu@ibeidiao.com
* @ version 1.0
*
*/

public class MyMediator extends AbstactMediator {
    @Override
    public void execute(String name, String method) {

        if("self".equals(method)){
            if("ColleagueB".equals(name)){
                ColleagueB colleagueB = (ColleagueB)super.colleagues.get("ColleagueB");
                colleagueB.self();
            }else if("ColleagueA".equals(name)){
                ColleagueA colleagueA = (ColleagueA) super.colleagues.get("ColleagueA");
                colleagueA.self();
            }

        }else{
            if("ColleagueB".equals(name)){
                ColleagueB colleagueB = (ColleagueB)super.colleagues.get("ColleagueB");
                colleagueB.out();
            }else if("ColleagueA".equals(name)){
                ColleagueA colleagueA = (ColleagueA) super.colleagues.get("ColleagueA");
                colleagueA.out();
            }
        }

    }
}
