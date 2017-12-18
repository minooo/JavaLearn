package com.minooo.animal;

public class CatTest {
    public static void main(String[] args) {
        Cat one = new Cat();

        // 测试
        one.eat();
        one.run();
        one.name = "七七";
        one.age = 2;
        one.weight = 1000;
        one.species = "中华田园猫";
        System.out.println("昵称：" + one.name);
        one.run(one.name);
    }
}
