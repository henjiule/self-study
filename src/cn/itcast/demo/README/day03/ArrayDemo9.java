package cn.itcast.demo.README.day03;

/**
 * @ClassName ArrayDemo9
 * @Description TODO
 * @Author zhangcong
 * @Date 2020/11/21
 **/
public class ArrayDemo9 {
    public static void main(String[] args) {
        int x = 3;
        int y = 4;
        int z = sum(x,y);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
    public static int sum (int a, int b) {
        int c = a+b;
        a++;
        b++;
        return c;
    }
}
