package com.chen.programmer.javaProgrammer;

import java.io.File;

/**
 * Created by Administrator on 2017/9/22.
 *
 * JAVA输出指定目录下的子目录和子文件
 */

public class FileOut {

    public static void main(String[] args){
        printFiles(new File("E:\\KuGou\\Lyric\\j-REC001-00000000000000000000000000000000-14336409-00000000.krc"),1);
        printFiles(new File("E:\\KuGou"),1);
    }

    public static void printFiles(File file,int tab){
        if (file.isFile()){
            System.out.println("你选择的是一个文件！");
            System.out.println(file.getName());
           /* System.out.println("你选择的是一个文件！");*/
        }else {
            File[] fileList= file.listFiles();

            for (int i=0;i<fileList.length;i++){
                for (int j=0;j<tab;j++){
                    System.out.print("|---");
                }
                System.out.println(fileList[i].getName());

                if (fileList[i].isDirectory()){
                    printFiles(fileList[i],tab+1);
                }
            }
        }
    }
}






































/*
    public static void main(String[] args){
        printFile(new File("E:\\KuGou"),1);

    }

    public static void printFile(File file,int tab){
        if (file.isFile()){
            System.out.println("你选择的是一个文件");
        }else{
            File[] fileList = file.listFiles();//获取目录下所有文件

            for (int i=0;i<fileList.length;i++){
                for (int j=0;j<tab;j++){
                    System.out.print("|---");
                }

                System.out.println(fileList[i].getName());

            if (fileList[i].isDirectory()) {
                printFile(fileList[i],tab+1);
            }
            }
        }

    }
}
*/
