package com.minooo.animal;

public class Cat {
    // 成员属性
    String name;
    int age;
    double weight;
    String species;

    // 成员方法
    public void run() {
        System.out.println("小猫快跑");
    }

    public void run(String name){
        System.out.println(name + "快跑");
    }

    public void eat() {
        System.out.println("小猫吃鱼");
    }
}
