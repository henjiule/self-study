package cn.itcast.demo.README.day01;

import java.util.Scanner;

/**
 * @ClassName IfDemo4
 * @Description TODO
 * @Author zhangcong
 * @Date 2020/11/1
 **/
public class IfDemo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个数");
        int a = sc.nextInt();
        System.out.println("请输入第二个数");
        int b = sc.nextInt();

        int max;

        if( a>=b ) {
             max = a;
        }else {
             max = b;
        }
        System.out.println("最大值是：" + max);
    }
}
