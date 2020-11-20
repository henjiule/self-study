package cn.itcast.demo.README.day03;

import java.util.Scanner;

/**
 * @ClassName MethodDemo2
 * @Description TODO
 * @Author zhangcong
 * @Date 2020/11/20
 **/
public class MethodDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请录入第一个整数：");

        int numl = sc.nextInt();

        System.out.println("请录入 第二个整数：");

        int num2 = sc.nextInt();

        boolean is = compare(numl,num2);
        System.out.println(is);

    }
    public static boolean compare(int a , int b ) {
       // boolean c =(a==b);
        // return c;




        return a == b;
    }
}
