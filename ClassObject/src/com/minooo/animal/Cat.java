// package com.minooo.animal;
//public class Cat {
//    // 成员属性
//    String name;
//    int age;
//    double weight;
//    String species;
//
//    public Cat() {
//
//    }
//
//    public Cat(String name, int age, double weight, String species) {
//        this.name = name;
//        this.age = age;
//        this.weight = weight;
//        this.species = species;
//    }
//
//    // 成员方法
//    public void run() {
//        this.eat();
//        System.out.println("小猫快跑");
//    }
//
//    public void run1(){
//        System.out.println(name + "快跑");
//    }
//
//    public void eat() {
//        System.out.println("小猫吃鱼");
//    }
//}

package com.minooo.animal;

public class Cat {
    // 成员属性
    private String name;
    private int age;
    private double weight;
    private String species;

    public Cat(int month) {
        //this.age = month;
        this.setAge(month);
    }

    // 创建 get/set 方法
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return "我是一只叫做：" + this.name + "的宠物猫";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
