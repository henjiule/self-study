package cn.itcast.demo.README.day03;

/**
 * @ClassName OverLoadDemo
 * @Description TODO
 * @Author zhangcong
 * @Date 2020/11/21
 **/
public class OverLoadDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        boolean flag1 = compare(a,b);
        System.out.println(flag1);
        System.out.println("------------");

        long num1 = 20L;
        long num2 = 20L;
        boolean flag2 = compare(num1,num2);
        System.out.println(flag2);
        System.out.println("------------");

        double d1 = 2.3;
        double d2 = 2.4;
        boolean flag3 = compare(d1,d2);
        System.out.println(flag3);
        System.out.println("------------");
    }
    public static boolean compare(int a , int b) {
        System.out.println("判断两个int类型数据是否相同");
        return a==b;
    }
    public static boolean compare(long a , long b) {
        System.out.println("判断两个long类型数据是否相同");
        return a==b;
    }
    public static boolean compare(double a , double b) {
        System.out.println("判断两个double类型数据是否相同");
        return a==b;
    }
}
