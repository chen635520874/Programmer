package com.chen.programmer.temporary;

import java.util.Random;

/**
 * Created by Administrator on 2017/11/10.
 */

//public class Vehicle {

  class RandomTest{
    public static void main(String[] args){

        int i=(int)(Math.random()*100);       //  生成0-100的随机数(math.random是取0-1之间的随机数，乘以*100就是1-100）

        Random rand=new Random();
        //包括0但不包括100，要包括100.请写成nextInt(101)为
        int j=rand.nextInt(30)+27;              // 这里是一个方法的重载，参数的内容是指定范围30是随机数上限，下限默认0，加上27就是全部加27结果是27-56；


        System.out.println("i:"+i+"\nj:"+j); // 分别输出两个随机数
    }
}

//}
