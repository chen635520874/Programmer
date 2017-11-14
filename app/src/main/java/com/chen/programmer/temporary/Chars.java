package com.chen.programmer.temporary;

/**
 * Created by Administrator on 2017/11/14.
 */

public class Chars {

    /*public static void main(String args[]) {
        String Str1 = new String("www.runoob.com");
        char[] Str2 = new char[6];

        try {
            Str1.getChars(4, 10, Str2, 0);
            System.out.print("拷贝的字符串为：" );
            System.out.println(Str2 );
        } catch( Exception ex) {
            System.out.println("触发异常...");
        }
    }
*/
    public static void main(String args[]){
        for(int i=0; i<args.length; i++){
            System.out.println("args[" + i + "]: " + args[i]);
        }
    }
}
