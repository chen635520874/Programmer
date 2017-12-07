package com.chen.programmer.normal;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/11/15.
 *
         next() 与 nextLine() 区别
         next():
         1、一定要读取到有效字符后才可以结束输入。
         2、对输入有效字符之前遇到的空白，next() 方法会自动将其去掉。
         3、只有输入有效字符后才将其后面输入的空白作为分隔符或者结束符。
         next() 不能得到带有空格的字符串。
         nextLine()：
         1、以Enter为结束符,也就是说 nextLine()方法返回的是输入回车之前的所有字符。
         2、可以获得空白。
 */

public class ScannerDemo {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

      /*  if (scanner.hasNext()){
            String str = scanner.next();
            System.out.println(str);
        }
*/

        // 从键盘接收数据
        int i = 0 ;
        float f = 0.0f ;
        System.out.print("输入整数：");
        if(scanner.hasNextInt()){
            // 判断输入的是否是整数
            i = scanner.nextInt() ;
            // 接收整数
            System.out.println("整数数据：" + i) ;
        }else{
            // 输入错误的信息
            System.out.println("输入的不是整数！") ;
        }
        System.out.print("输入小数：");
        if(scanner.hasNextFloat()){
            // 判断输入的是否是小数
            f = scanner.nextFloat() ;
            // 接收小数
            System.out.println("小数数据：" + f) ;
        }else{
            // 输入错误的信息
            System.out.println("输入的不是小数！") ;
        }
    }
}
