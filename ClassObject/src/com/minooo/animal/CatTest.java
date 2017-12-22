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
        Cat one = new Cat(3);
        System.out.println(one.getAge());

//        one.setName("花花");
//        System.out.println(one.getName());
    }
}
