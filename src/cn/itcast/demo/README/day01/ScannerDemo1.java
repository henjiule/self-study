package cn.itcast.demo.README.day01;
//1、导包

import java.util.Scanner;

/**
 * @ClassName ScannerDemo1
 * @Description TODO
 * @Author zhangcong
 * @Date 2020/11/1
 **/
public class ScannerDemo1 {
    public static void main(String[] args) {
        //2、创建键盘录入对象.
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个整数；");

        //3、接收数据
        int i = sc.nextInt();

        //将用户录入的数据打印到控制台上。
        System.out.println("i:" + i);




    }
}
