package com.github7;
/*
   Author:linrui
   Date:2019/8/2
   Content:懒汉式单例模式（懒汉式存在多线程安全问题，而饿汉式不会）
   第一次去使用Singleton对象的时候才会为其产生实例化对象的操作.
   构造方法私有化，外部无法产生新的实例化对象，只能通过static方法取得实例化对象

*/
class LazyTest{

    private static LazyTest lazyObj;
    private LazyTest(){
    }
    public static LazyTest getLazyObj() {
       //如果没有实例化的话再实例化
        if(lazyObj==null){
            lazyObj=new LazyTest();
        }
        return lazyObj;
    }
    public void print(){
        System.out.println("LazyTest的方法");
    }
}
public class LazySingleton {
    public static void main(String[] args) {
        LazyTest lazyTest=null;
        LazyTest lazyTest2=null;
        //构造方法私有化，只能通过get方法获取对象。
        lazyTest=LazyTest.getLazyObj();
        lazyTest2=LazyTest.getLazyObj();
        lazyTest.print();
        lazyTest2.print();

    }
}
