//package com.minooo.animal;
//
//public class CatTest {
//    public static void main(String[] args) {
//        Cat one = new Cat("花花", 3, 1000, "中华猫");
//        Cat two = new Cat();
//        two.name = "haha";
//        two.run1();
//        one.run1();
//        // 测试
//        // System.out.println("昵称：" + one.name);
//    }
//}


package com.minooo.animal;

public class CatTest {
    public static void main(String[] args) {
        Cat one = new Cat();
        one.setName("可");

        Cat.price = 300;
        Cat two = new Cat();
        two.setName("否");
        Cat.price = 200;


        System.out.println(one.price);
        System.out.println(two.price);

//        one.setName("花花");
//        System.out.println(one.getName());
    }
}
