package com.github7;

/*
   Author:linrui
   Date:2019/8/2
   Content:单例设计指的是一个类只允许产生一个实例化对象。
   所以构造方法应该私有化，内部产生一个供别人使用

*/
class Singleton {
    //无参构造方法
    private Singleton() {

    }
    //创建一个实例化对象
    private static Singleton singleton = new Singleton();

    public static Singleton getSingleton() {
        return singleton;
    }
    //以及getter方法
    public void code() {
        System.out.println("Singleton的code方法");
    }
}
//在以上Class中，不管你是否使用Singleton类的对象，
//只要该类加载了，那么一定会自动创建好一个公共的singleton对象。
public class SingletonMain {
    public static void main(String[] args) {
        //由于此时Singleton类中有私有的无参构造方法，所以只能实例化对象才能调用code（）
        Singleton singleton = null;
        //获取对象
        singleton = Singleton.getSingleton();
    }
}
