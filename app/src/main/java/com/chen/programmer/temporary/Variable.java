package com.chen.programmer.temporary;

import java.util.Random;

/**
 * Created by Administrator on 2017/11/10.
 */

//public class Vehicle {

  class RandomTest{
    public static void main(String[] args){
        Random rand=new Random();
        int i=(int)(Math.random()*100);       //  生成0-100的随机数
        int j=rand.nextInt(30)+27;              // 这里是一个方法的重载，参数的内容是指定范围(

        System.out.println("i:"+i+"\nj:"+j); // 分别输出两个随机数
    }
}

//}
