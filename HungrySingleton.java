package com.github7;
/*
   Author:linrui
   Date:2019/8/2
   Content:饿汉式单例模式

   只要该类加载了，就一定会创建好一个公共的对象
   并且整体操作之间只能有一个实例化对象
*/

class HungryTest {
    //实例化对象
    private final static HungryTest hungryObj = new HungryTest();

    public static HungryTest getHungryObj() {
        return hungryObj;
    }
    //无参构造方法
    private HungryTest() {
    }
    //方法
    public void print(){
        System.out.println("HungryTest方法");
    }
}

public class HungrySingleton {
    public static void main(String[] args) {
        HungryTest hungryTest=null;
        HungryTest hungryTest2=null;
        //创建的对象共用一个实例化对象
        hungryTest=HungryTest.getHungryObj();
        hungryTest2=HungryTest.getHungryObj();
        hungryTest.print();
    }
}
