package com.ibeidiao.hello.behavior_mode.thirdcategory.first;

/**
*
* @ author  shayu
* @ time  2017/5/24
* @ email shayu@ibeidiao.com
* @ version 1.0
*
*/

public class Original {

    private String name;

    public Original(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Memento createMemento(){

        return new Memento(name);

    }

    public void restoreMemento(Memento memento){

        this.name =  memento.getName();
    }


}
