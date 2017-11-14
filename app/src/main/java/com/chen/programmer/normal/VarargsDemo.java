package com.chen.programmer.normal;

/**
 * Created by Administrator on 2017/11/14.
 *
 * Java1.5增加了新特性：可变参数：适用于参数个数不确定，类型确定的情况，
 * java把可变参数当做数组处理。注意：可变参数必须位于最后一项。
 * 当可变参数个数多余一个时，必将有一个不是最后一项，所以只支持有一个可变参数。
 * 因为参数个数不定，所以当其后边还有相同类型参数时，
 * java无法区分传入的参数属于前一个可变参数还是后边的参数，
 * 所以只能让可变参数位于最后一项。
 */

public class VarargsDemo {
    public static void main(String args[]) {
        // 调用可变参数的方法
        printMax(34, 3, 3, 2, 56.5);
        printMax(new double[]{1, 2, 3});
    }

    public static void printMax( double... numbers) {
        if (numbers.length == 0) {
            System.out.println("No argument passed");
            return;
        }

        double result = numbers[0];

        for (int i = 1; i <  numbers.length; i++){
            if (numbers[i] >  result) {
                result = numbers[i];
            }
        }
        System.out.println("The max value is " + result);
    }
}
