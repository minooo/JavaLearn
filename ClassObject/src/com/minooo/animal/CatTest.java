package com.minooo.animal;

public class CatTest {
    public static void main(String[] args) {
        Cat one = new Cat("花花", 3, 1000, "中华猫");
        Cat two = new Cat();
        two.name = "haha";
        two.run1();
        one.run1();
        // 测试
        // System.out.println("昵称：" + one.name);
    }
}
