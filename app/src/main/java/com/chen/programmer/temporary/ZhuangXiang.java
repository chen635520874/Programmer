package com.chen.programmer.temporary;

/**
 * Created by Administrator on 2017/11/14.
 *
 * java中的自动装箱与拆箱
 * 简单一点说，装箱就是自动将基本数据类型转换为包装器类型；拆箱就是自动将包装器类型转换为基本数据类型。
 */

public class ZhuangXiang {

    public static void main(String args[]){

        Integer i = 128;//装箱，相当于Integer i =Integer.valueOf(128)
        int t = i;//拆箱，相当于i1.intValue（)
        System.out.println(t);

        /**
         *
         Integer a = 10;
         Integer b = 10;
         System.out.println(a == b);        // true
         System.out.println(a.equals(b));   // true
         Integer a = 1000;
         Integer b = 1000;
         System.out.println(a == b);        // false
         System.out.println(a.equals(b));   // true
         对于–128到127（默认是127）之间的值,被装箱后，会被放在内存里进行重用
         但是如果超出了这个值,系统会重新new 一个对象
         */


        Integer i1 = 200;
        Integer i2 = 200;

        /**
         注意 == 与 equals的区别
         == 它比较的是对象的地址
         equlas 比较的是对象的内容
         */
        if(i1==i2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}