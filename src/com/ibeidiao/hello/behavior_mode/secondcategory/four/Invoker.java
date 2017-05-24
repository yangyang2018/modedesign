package com.ibeidiao.hello.behavior_mode.secondcategory.four;

/**
*
* @ author  shayu
* @ time  2017/5/24
* @ email shayu@ibeidiao.com
* @ version 1.0
*
*/

public class Invoker {

    private Command  command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action(){
        System.out.println("司令传达命令了。。。。。。。。。");
        command.exit();
    }
}
